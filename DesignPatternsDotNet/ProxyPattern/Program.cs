using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProxyPattern
{
    public class Program
    {
        public static void Main(string[] args)
        {
            IBalanceInformation myProxy = new StatementInformer();
            Console.WriteLine(myProxy.GetBalance().ToString());
            Console.ReadLine();
        }
    }
}
