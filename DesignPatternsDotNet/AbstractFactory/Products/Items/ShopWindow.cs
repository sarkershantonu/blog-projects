using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AbstractFactory.Products.Items
{
    public class ShopWindow:IWindow
    {
        public string ToString()
        {
            return "Size 40";
        }
        public ShopWindow()
        {
		Console.WriteLine("Resident window is created");
	}
    }
}
