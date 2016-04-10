using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using AbstractFactory.Factories;

namespace AbstractFactory.Products
{
    public class Shop:House
    {
        private IHouseBuilder myBuilder;
        public Shop(IHouseBuilder aBuilder) {
		myBuilder=aBuilder;
        Console.WriteLine("Shop Created");
	}
        public override void makehouse() {
            Console.WriteLine("Making  " + getName());
		    aDoor = myBuilder.addDoor();
	    	furniture = myBuilder.addFurniture();
	    	aToilet=myBuilder.addToilet();
	    	aWindow=myBuilder.addWindow();
        }
    }
}
