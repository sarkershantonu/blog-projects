using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ChainOfResponsibility
{
    class Program
    {
        public static void Main(string[] args)
        {
            MyHandler worker1 = new RealHandlerOne();
            MyHandler worker2 = new RealHandlerTwo();
            MyHandler worker3 = new RealHandlerThree();            

            //Making chain 
            worker1.NextHandler=worker2;
            worker2.NextHandler = worker3;
            worker3.NextHandler = worker1;

            Task t1 = new Task(-100, "Negative value");
            Task t2 = new Task(0, "ZERO");
            Task t3 = new Task(1, "ONE");
            Task t4 = new Task(2, "TWO");
            Task t5 = new Task(3, "THREE");
            Task t6 = new Task(4, "FOUR");

            //Calling the request, user need to call only worker 1. 
            worker1.DoThis(t1);
            worker1.DoThis(t2);
            worker1.DoThis(t3);
            worker1.DoThis(t4);
            worker1.DoThis(t5);
            worker1.DoThis(t6);
            Console.ReadLine();
        }
    }
}
