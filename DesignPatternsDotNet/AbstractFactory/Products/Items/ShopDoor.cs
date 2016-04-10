using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AbstractFactory.Products.Items
{
    public class ShopDoor : IDoor
    {
        public ShopDoor()
        {
		Console.WriteLine("Shop Door is created"); 
	}
    public string ToString()
    {
        return "not designed and has no bell";
    }
    }
}
