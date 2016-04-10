using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using AbstractFactory.Products.Items;

namespace AbstractFactory.Products
{
    public abstract class House
    {
        private String name;
        public String getName() { return name; }
        public void setName(String newName) { name = newName; }
        protected IDoor aDoor;
        protected IWindow aWindow;
        protected IFurniture furniture;
        protected IToilet aToilet;
        public abstract void makehouse();
        public void displayName()
        {
		    Console.WriteLine(getName()+" is the Name of the house");
	    }
        public string ToString()
        {
            String info = "The " + name + " has a door which is " + aDoor + ", a window which is " + aWindow +
                    " , a toilet which has " + aToilet + " and " + furniture;
            return info;
        }
    }
}
