using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AbstractFactory.Products.Items
{
    public class ShopToilet:IToilet
    {
        public ShopToilet()
        {
            Console.WriteLine("Shop toilet is created"); 
	}
        public string ToString()
        {
            return "no bathtub and no shawar";
        }
    }
}
