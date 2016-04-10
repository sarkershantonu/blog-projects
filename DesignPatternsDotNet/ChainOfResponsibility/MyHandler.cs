using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ChainOfResponsibility
{
    public abstract class MyHandler
    {
        protected MyHandler myNextHandler;

        public MyHandler NextHandler
        {       
            set
            {
            myNextHandler = value;
            }
        }
        public abstract void DoThis(Task task);
       

    }
}
