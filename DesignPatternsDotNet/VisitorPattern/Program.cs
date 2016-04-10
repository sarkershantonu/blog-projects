using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace VisitorPattern
{
    class Program
    {
        
        static void Main(string[] args)
        {
            SalesTaxMonitor vatMonitor = new SalesTaxMonitor();		
            Chocolate chocolate = new Chocolate(20);// price 20
            SoftDrink drinks = new SoftDrink(40);// price 40
            Fruit apple = new Fruit(15);// price 15
            Console.WriteLine("The VAT summary");
            Console.WriteLine(chocolate.AddTaxMonitor(vatMonitor).ToString("#.##"));
            Console.WriteLine(drinks.AddTaxMonitor(vatMonitor).ToString("#.##"));
            Console.WriteLine(apple.AddTaxMonitor(vatMonitor).ToString("#.##"));
            Console.ReadLine();	
        }
    }
}
