using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace FactoryMethod
{
    public class Pencil:IProduct
    {
        public void ShowMe()
        {
            Console.WriteLine("A Pencil is made");
        }
    }
}
