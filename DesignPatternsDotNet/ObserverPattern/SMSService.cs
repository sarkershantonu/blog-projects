using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ObserverPattern
{
    public class SMSService : MyObserver
    {
        public override void update()
        {
            Console.WriteLine("I have notified by SMS : ");

        }
        public override void update(Object args)
        {
            Console.WriteLine("I have notified by SMS : "+args.ToString());
        }
    }
}
