using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Decorator
{   
    public class FoilPaperCover : BookMaker
    {
        public FoilPaperCover(IBook book)
            : base(book)
        {
            Console.WriteLine("Foil paper covering");
        }
        public string Description { get { return aBook.Description + ", foil paper covering"; } set { aBook.Description = value; } }
        public override double Price { get { return aBook.Price + 10.50; } set { aBook.Price = value; } }
    }    
}
