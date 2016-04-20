using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data.SqlClient;

namespace SingleTone
{
    public sealed class SqlConn
    {
        private static volatile SqlConn myInstance;// use readonly in place of volatile for single thread operation
        private static object sync = new Object();//for locking serilize object 
        private SqlConnection myConn; 

        private SqlConn()
        {
            try
            {
                myConn = new SqlConnection(DbInfo.connectionString);
                myConn.Open();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.StackTrace);
            }

        }

        public void CloseConn()
        {
            myConn.Close();
        }

        public static SqlConn Instance//This is single tone property
        {
            get
            {
                if (myInstance == null)//chacking instances
                {
                    lock(sync) // ensures single thread access that, if we use single thread scenario, we can avoid that
                    {
                        if (myInstance == null)//chacking instances
                        {
                            myInstance = new SqlConn();
                        }
                    }
                }
                return myInstance;
            }
        }
    }
}
