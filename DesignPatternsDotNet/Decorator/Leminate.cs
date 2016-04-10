using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Decorator
{   
    public class Leminate : BookMaker
    {
        public Leminate(IBook book)
            : base(book)
        {
            Console.WriteLine("Leminate covering");
        }
        public string Description { get { return aBook.Description + ", Leminateting"; } set { aBook.Description = value; } }
        public override double Price { get { return aBook.Price + 20.00; } set { aBook.Price = value; } }
    }    
}
