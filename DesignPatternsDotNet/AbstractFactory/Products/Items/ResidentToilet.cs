using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AbstractFactory.Products.Items
{
    public class ResidentToilet:IToilet
    {
        public ResidentToilet(){
		Console.WriteLine("Residen toilet is created"); 
	}
        public string ToString()
        {
            return "bathtub and shawar ";
        }
    }
}
