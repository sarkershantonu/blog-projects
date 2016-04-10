using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StrategyPattern
{
    public class Ship
    {
        private string name;
        public IStrategyBehaviour work;
        public Ship(string aName)
        {
            name = aName;
            //Console.WriteLine("A ship is created");
        }
        public string Name
        {
            get
            {
                return name;
            }
        }
        public void GetToWork()
        {
            work.Carry();
        }
        public void SetToWork(IStrategyBehaviour aWork)
        {
            work = aWork;
        }
    }
}
