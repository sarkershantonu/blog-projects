using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AbstractFactory.Products.Items
{
    public class OfficeDoor : IDoor
    {
        public OfficeDoor(){
		Console.WriteLine("Office Door is created"); 
	}
    public string ToString()
    {
        return "designed but no bell";
    }
    }
}
