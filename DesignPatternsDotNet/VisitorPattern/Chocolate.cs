using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace VisitorPattern
{
    class Chocolate :ITaxable
    {
        private double price;
        public Chocolate(double aPRice)
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
