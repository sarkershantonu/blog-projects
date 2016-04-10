using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using CommandPattern.Commands;

namespace CommandPattern
{
    public class MobileButtonInvoker
    {
        private ICommand aCommand;
        //If we want to apply stack based undo operation, we can keep an array list of ICommands and perform undo by invoker, but I apply that undo in ICommand.
        public MobileButtonInvoker(ICommand newConnand)
        {
            aCommand = newConnand;
        }
        public void Press()
        {
            aCommand.Execute();
        }
        public void PressBack()
        {
            aCommand.Undo();
        }
    }
}
