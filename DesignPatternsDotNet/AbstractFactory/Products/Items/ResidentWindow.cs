using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AbstractFactory.Products.Items
{
    public class ResidentWindow:IWindow
    {
        public string ToString()
        {
            return "Size 10";
        }
        public ResidentWindow(){
		Console.WriteLine("Resident window is created");
	}
    }
}
