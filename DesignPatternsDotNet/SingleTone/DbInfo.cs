using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SingleTone
{
    public class DbInfo
    {
        public static string port = "3306";
        public static string dbName = "database_name";
        public static string hostIP = "192.168.1.101";
        public static string hostName = "shantonu-dell";
        public static string userName = "sa";
        public static string password = "1234567890";      
        public static string instance = "sqlexpress";
        public static string connectionString = "Data source ="+hostName+"\\"+instance+
            "; UserID=" + userName + "; Password = " + password + "; Initial Catalog=" + dbName + ";IntegratedSecurity=True;";
    }
}
