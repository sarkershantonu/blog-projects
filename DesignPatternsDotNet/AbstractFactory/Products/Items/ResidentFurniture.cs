using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AbstractFactory.Products.Items
{
    public class ResidentFurniture:IFurniture
    {
        public ResidentFurniture(){
		Console.WriteLine("Resident furniture is created"); 
	}
        public string ToString()
        {
            return "Full Free Furniture";
        }
    }
}
