using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace VisitorPattern
{
    class SalesTaxMonitor : ITaxMonitor
    {
        public double AddTax(Chocolate aChocolate) {
		Console.WriteLine("Sales Tax Added with a Chocolate");
		return aChocolate.Price*1.015;
	    }
        public double AddTax(SoftDrink aDrink) {
            Console.WriteLine("Sales Tax Added with a Drink");
		return aDrink.Price*1.015;
	    }
        public double AddTax(Fruit aFruit) {
            Console.WriteLine("Sales Tax Added with a Fruit");
	    	return aFruit.Price*1.015;
	    }
    }
}
