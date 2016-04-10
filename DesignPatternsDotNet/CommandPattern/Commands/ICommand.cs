using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CommandPattern.Commands
{
    public interface ICommand
    {
        void Execute();
        void Undo();//in android mobile, back button refers to undo if any command do not have inverse function(like volume has + & - or power button has On & off
    }

}
