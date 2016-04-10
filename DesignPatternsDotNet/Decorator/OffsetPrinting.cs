using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Decorator
{
    public class OffsetPrinting : BookMaker {

        public OffsetPrinting(IBook book): base(book)
        {
            Console.WriteLine("Offset Printing");
	    }
        public string Description { get { return aBook.Description + ", offset printing"; } set { aBook.Description = value; } }
        public override double Price { get { return aBook.Price+200.00; } set { aBook.Price = value; } }
    }
}
