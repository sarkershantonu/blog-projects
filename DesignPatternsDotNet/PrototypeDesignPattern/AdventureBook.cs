using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PrototypeDesignPattern
{
    class AdventureBook : IBookPrototype
    {
        public AdventureBook()
        {
            Console.WriteLine("An adventure book is bought");	
        }
        public object Clone() 
        {
            object aBook = null;
		    aBook = (AdventureBook)base.MemberwiseClone();		    
		    Console.WriteLine("An adventure book is cloned");
		    return aBook;
        }
    }
}
