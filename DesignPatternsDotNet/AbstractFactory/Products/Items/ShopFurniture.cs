using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AbstractFactory.Products.Items
{
    public class ShopFurniture:IFurniture
    {
        public ShopFurniture()
        {
            Console.WriteLine("Shop furniture is created");
        }
        public string ToString()
        {
            return "Free basic Furniture";
        }
    }
}
