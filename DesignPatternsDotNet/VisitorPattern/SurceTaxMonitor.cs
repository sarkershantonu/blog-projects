using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace VisitorPattern
{
    class SurceTaxMonitor :ITaxMonitor
    {
        public double AddTax(Chocolate aChocolate) {
		Console.WriteLine("No source Tax for Chocolate");
		return aChocolate.Price;
	}
        public double AddTax(SoftDrink aDrink) {
            Console.WriteLine("Source Tax Added with a Drink");
		return aDrink.Price*1.01;
	}
        public double AddTax(Fruit aFruit) {
            Console.WriteLine("No source Tax for fruits");
		return aFruit.Price;
	}
    }
}
