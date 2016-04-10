using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MementoPattern
{
    class Memento
    {
        private string state;
        public Memento(string aState)
        {
            state=aState;
            Console.WriteLine("A memento is created");
        }
        public string State
        {
            get
            {
                Console.WriteLine("State is retrived from Memento");
                return state;                
            }
        }
    }
}
