using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PrototypeDesignPattern
{
    class Program
    {
        static void Main(string[] args)
        {
            BookManagerFactory bookCloner = new BookManagerFactory();
		    IBookPrototype aCloneBook = null; 
		    IBookPrototype aBook = new AdventureBook();
		    aCloneBook=(AdventureBook)bookCloner.getClone(aBook);
		    Console.WriteLine("The hash code for original Adventure book = "+aBook.GetHashCode().ToString());
		    Console.WriteLine("The hash code for cloned Adventure book = "+aCloneBook.GetHashCode().ToString());
		    aBook = new KidsBook();
		    aCloneBook=(KidsBook)bookCloner.getClone(aBook);
		    Console.WriteLine("The hash code for original kid book = "+aBook.GetHashCode().ToString());
            Console.WriteLine("The hash code for cloned kid book = " + aCloneBook.GetHashCode().ToString());
            Console.ReadLine();
        }
    }
}
