using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;

namespace MementoPattern
{
    class CareTaker
    {
        private ArrayList mementos = new ArrayList();
        public void ADD(Memento aMemento)
        {
            mementos.Add(aMemento);
            Console.WriteLine("One Item added, so no item count : " +mementos.Count);
        }
        public Memento GetMemento(int index)
        {
            return (Memento)mementos[index];
        }
    }
}
