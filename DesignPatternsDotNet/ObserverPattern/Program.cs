using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ObserverPattern
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Current News is : Dummy Text");
		    NewsAgency myAgency = new NewsAgency();
		    SMSService sms = new SMSService();
		    EmailService email = new EmailService();
		    myAgency.AddObserver=sms;
            myAgency.AddObserver=email;
		    myAgency.Add="shantonu is coading";
            myAgency.notifyAllOvservers("shantonu is coading");
            Console.ReadLine();
        }
    }
}
