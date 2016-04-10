using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace VisitorPattern
{
    class StateTaxMonitor : ITaxMonitor
    {
        public double AddTax(Chocolate aChocolate) {
            Console.WriteLine("State Tax Added with a Chocolate");
		return aChocolate.Price*1.005;
	}
        public double AddTax(SoftDrink aDrink) {
		Console.WriteLine("State Tax Added with a Drink");
		return aDrink.Price*1.005;
	}
        public double AddTax(Fruit aFruit) {
            Console.WriteLine("No State Tax fora Fruit");
		return aFruit.Price;
	}
    }
}
