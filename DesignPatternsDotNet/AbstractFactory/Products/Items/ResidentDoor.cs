using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AbstractFactory.Products.Items
{
    public class ResidentDoor : IDoor
    {
        public ResidentDoor()
        {
            Console.WriteLine("Resident Door is created"); 
        }
        public string ToString()
        {
            return "designed and has bell";
        }
    }
}
