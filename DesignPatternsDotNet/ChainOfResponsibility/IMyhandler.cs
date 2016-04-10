using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ChainOfResponsibility
{
    public interface IMyhandler
    {
        MyHandler NextHandler { set; }
         void DoThis(Task task);
    }
}
