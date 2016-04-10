using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using AbstractFactory.Products.Items;

namespace AbstractFactory.Factories
{
    public class ShopBuilder:IHouseBuilder
    {
        public ShopBuilder()
        {
		Console.WriteLine("Shop builder is created");
	}
        public IDoor addDoor()
        {
            return new ShopDoor();
        }
        public IWindow addWindow()
        {
            return new ShopWindow();
        }
        public IToilet addToilet()
        {
            return new ShopToilet();
        }
        public IFurniture addFurniture()
        {
            return new ShopFurniture();
        }
    }
}
