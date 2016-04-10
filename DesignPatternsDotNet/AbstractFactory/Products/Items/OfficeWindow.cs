using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AbstractFactory.Products.Items
{
    public class OfficeWindow:IWindow
    {
        public string ToString()
        {
            return "Size 20";
        }
        public OfficeWindow()
        {
            Console.WriteLine("Office window is created");
	    }
    }
}
