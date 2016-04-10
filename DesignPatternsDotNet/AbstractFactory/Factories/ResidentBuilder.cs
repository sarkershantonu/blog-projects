using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using AbstractFactory.Products.Items;

namespace AbstractFactory.Factories
{
    public class ResidentBuilder:IHouseBuilder
    {
        public ResidentBuilder(){
		Console.WriteLine("Resident builder is created");
	}
        public IDoor addDoor()
        {
            return new ResidentDoor();
        }
        public IWindow addWindow()
        {
            return new ResidentWindow();
        }
        public IToilet addToilet()
        {
            return new ResidentToilet();
        }
        public IFurniture addFurniture()
        {
            return new ResidentFurniture();
        }
    }
}
