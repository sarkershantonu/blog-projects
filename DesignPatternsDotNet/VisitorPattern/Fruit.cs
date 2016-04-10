using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace VisitorPattern
{
    class Fruit
    {
        private double price;
        public Fruit(double aPRice)
        {
            price = aPRice;
        }
        public double Price
        {
            get
            {
                return price;
            }
        }
        public double AddTaxMonitor(ITaxMonitor taxMonitor)
        {
            return taxMonitor.AddTax(this);
        }
    }
}
