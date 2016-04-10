using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PrototypeDesignPattern
{
    class KidsBook : IBookPrototype
    {
        public KidsBook()
        {
            Console.WriteLine("A Kids book is bought");
        }
        public object Clone() {
		object aBook=null;
        aBook = (KidsBook)base.MemberwiseClone();
        Console.WriteLine("A Kids book is cloned");
		return aBook;
	}
    }
}
