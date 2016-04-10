using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MementoPattern
{
    class Program
    {
        CareTaker myStore = null;
        Originator originator = null;
        public static int itemNumber = 0;

        static void Main(string[] args)
        {
            new Program();
        }
        public Program()
        {
		myStore = new CareTaker();
		originator = new Originator();
		Console.WriteLine("Storing Memento");
		originator.Set("My Initial State which will be stored");
		myStore.ADD(originator.Store());
		itemNumber++;
		originator.Set("My Changed State which will not be stored and will be restored");
        Console.WriteLine("Restored : " + originator.Restore(myStore.GetMemento(itemNumber - 1)));
        Console.ReadLine();
	    }
    }
}
