using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProxyPattern
{
    public class Account : IBalanceInformation,IAccount
    {
        public string Name { get; set; }
        public string Address { get; set; }
        public string Mobile { get; set; }
        private double balance = 1000.00;
        public double Balance { get { return balance; } set { balance = value; } }
        private string lastAccessDate;
        public string LastAccess { get { return lastAccessDate; } set { lastAccessDate = value; } }

        public string GetLastAccessDate()
        {
            return lastAccessDate;
        }
        public double GetBalance()
        {
            return balance;
        }
    }
}
