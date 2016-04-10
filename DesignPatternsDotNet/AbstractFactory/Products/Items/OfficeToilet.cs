using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AbstractFactory.Products.Items
{
    public class OfficeToilet:IToilet
    {
        public OfficeToilet()
        {
            Console.WriteLine("Office toilet is created"); 
	}
        public string ToString()
        {
            return "only shawar no bathtub";
        }
    }
}
