using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using AbstractFactory.Products.Items;

namespace AbstractFactory.Factories
{
    public class OfficeBuilder:IHouseBuilder
    {
        public OfficeBuilder()
        {
            Console.WriteLine("Office builder is created");
	}
        public IDoor addDoor()
        {
            return new OfficeDoor();
        }
        public IWindow addWindow()
        {
            return new OfficeWindow();
        }
        public IToilet addToilet()
        {
            return new OfficeToilet();
        }
        public IFurniture addFurniture()
        {
            return new OfficeFurniture();
        }
    }
}
