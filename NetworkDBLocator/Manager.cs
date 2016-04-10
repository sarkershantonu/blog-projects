using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data.SqlClient;
using System.Data;
using System.Data.Sql;

namespace DbLocator
{
    public class Manager
    {
        public SqlConnection GetConnection(string db, string pc, string instance)
        {
            return GetConn(String.Format("server={0}; database={1}; integrated security = SSPI;", GetFullInstanceString(db, pc), instance));
        }
        public SqlConnection GetConnection(string pc, string instance)
        {
            return GetConn(String.Format("server={0}; integrated security = SSPI;", GetFullInstanceString(pc, instance)));
        }
        public SqlConnection GetConnection(string fullInstanceString)
        {
            return GetConn(String.Format("server={0}; integrated security = SSPI;", fullInstanceString));
        }
        public SqlConnection GetConnection(SQLServer server)
        {
            return GetConnection(server.PCName, server.InstanceName);
        }
        public SqlConnection GetConnection(SQLServer server, Database db)
        {
            return GetConnection(db.Name, server.PCName, server.InstanceName);
        }
        public SqlConnection GetConn(string connectionString)
        {
            return new SqlConnection(connectionString);
        }
        public string GetFullInstanceString(string pc, string instance)
        {
            return string.Format("{0}\\{1}", pc, instance);
        }

        public List<SQLServer> GetServers()
        {
            DataTable dataSource = SqlDataSourceEnumerator.Instance.GetDataSources();
            List<SQLServer> servers = new List<SQLServer>();
            foreach (var row in dataSource.Rows)
            {
                DataRow dataRow = row as DataRow;
                string serverName = dataRow.ItemArray[0].ToString();
                string instanceName = dataRow.ItemArray[1].ToString();
                bool isClustered = dataRow.ItemArray[2].ToString() == "Yes";
                string version = dataRow.ItemArray[3].ToString();
                SQLServer myServer = new SQLServer() { InstanceName=instanceName,
                PCName=serverName,Version=version,IsClustered=isClustered};
                servers.Add(myServer);
            }
            return servers;
        }
        public List<Database> GetDBs(SqlConnection connection)
        {
            try
            {
                connection.Open();
                SqlCommand command = new SqlCommand("sp_databases", connection);
                SqlDataReader reader = command.ExecuteReader();
                List<Database> dbs = new List<Database>();

                while (reader.Read())
                {
                    Database mydb = new Database()
                    {
                        Name = reader[0].ToString(),
                        Remarks = reader[2].ToString(),
                        size = (int)reader[1]
                    };
                    dbs.Add(mydb);
                }
                return dbs;
            }
            catch(Exception ex)
            {
                throw ex;
                
                
            } finally
            {        
                connection.Close();
            }
            
        }
        public List<Database> GetDBs(SQLServer server) {
            return GetDBs(GetConnection(server));
        }
        public List<Database> GetDBs(string fullInstanceString)
        {
            return GetDBs(GetConnection(fullInstanceString));
            
        }
        public bool CreateDB(Database db, SQLServer server)
        {
            return ExecuteNQ(server, "create database " + db.Name);
        }
        public bool DeleteDB(Database db, SQLServer server)
        {
            return ExecuteNQ(server, "drop database " + db.Name);
        }
        public bool ExecuteNQ(SQLServer server, string command)
        {
            SqlConnection myConn = this.GetConnection(server);
            try
            {
                myConn.Open();
                SqlCommand myCommand = new SqlCommand(command, myConn);
                int exe = myCommand.ExecuteNonQuery();
                return exe != 0;
            }
            catch (Exception ex)
            {
                //Console.WriteLine(ex.StackTrace);
                throw ex;
            }
            finally
            {
                myConn.Close();
            }
        }
    }
}
