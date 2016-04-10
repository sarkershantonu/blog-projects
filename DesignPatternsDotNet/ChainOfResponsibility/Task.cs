using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ChainOfResponsibility
{
    public class Task
    {
        private int myValue;
        private string description;
        public Task(int value, string des)
        {
            myValue = value;
            description = des;
        }

        public int Value
        {
            get { return myValue; }
        }
        public string Description
        {
            get{return description;}
        }
    }
}
