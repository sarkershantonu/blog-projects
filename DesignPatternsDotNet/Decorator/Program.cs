using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Decorator
{
    public class Program
    {
        public static void Main(string[] args)
        {
            IBook rawBook = new OffsetPrinting(new FoilPaperCover(new Leminate(new PlainBook())));
            Console.WriteLine("Description "+rawBook.Description);
            Console.WriteLine("Total Price " + rawBook.Price);
            Console.ReadLine();
        }
    }
}
