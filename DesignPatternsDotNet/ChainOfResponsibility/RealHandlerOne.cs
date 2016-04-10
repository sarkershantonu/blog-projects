using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ChainOfResponsibility
{
    public class RealHandlerOne : MyHandler
    {
        public override void DoThis(Task task)
        {
            if (task.Value < 0)
            {
                Console.WriteLine("This is Handler One and value = " + task.Value.ToString());
            }
            else
            {
                myNextHandler.DoThis(task);
            }
        }
    }
}
