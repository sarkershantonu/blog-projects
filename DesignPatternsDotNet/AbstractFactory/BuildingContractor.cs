using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using AbstractFactory.Products;
using AbstractFactory.Factories;

namespace AbstractFactory
{
    public class BuildingContractor:Contractor
    {
        public BuildingContractor() {
		Console.WriteLine("Building contractor created ");
	}
        public override House makeHouse(string typeOfHouse)
        {
            House myHouse = null;
            IHouseBuilder myBuilder = null;
            if (typeOfHouse.Equals("Resident"))
            {
                myBuilder = new ResidentBuilder();
                myHouse = new Resident(myBuilder);
                myHouse.setName("Resident House");
            }
            else if (typeOfHouse.Equals("Office"))
            {
                myBuilder = new OfficeBuilder();
                myHouse = new Office(myBuilder);
                myHouse.setName("Office");
            }
            else if (typeOfHouse.Equals("Shop"))
            {
                myBuilder = new ShopBuilder();
                myHouse = new Shop(myBuilder);
                myHouse.setName("Shop");
            }
            return myHouse;
        }
    }
}
