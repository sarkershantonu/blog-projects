using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace VisitorPattern
{
    interface ITaxMonitor
    {
        double AddTax(Chocolate aChocolate);
        double AddTax(SoftDrink aDrink);
        double AddTax(Fruit aFruit);
    }
}
