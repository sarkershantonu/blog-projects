using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace FactoryMethod
{
    public class Pen:IProduct
    {
        public void ShowMe()
        {
		    Console.WriteLine("A Pen is made");
        }
    }
}
