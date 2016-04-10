using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AbstractFactory.Products.Items
{
    public class OfficeFurniture:IFurniture
    {
        public OfficeFurniture()
        {
            Console.WriteLine("Office furniture is created");
        }
        public string ToString()
        {
            return "Full paid Furniture";
        }
    }
}
