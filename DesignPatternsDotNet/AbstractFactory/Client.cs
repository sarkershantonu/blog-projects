using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using AbstractFactory.Products;

namespace AbstractFactory
{
    class Client
    {
        public static void Main(string[] args)
        {
            Contractor myContractor = new BuildingContractor();
		    House myHouse = myContractor.orderAhouse("Shop");
            Console.WriteLine(myHouse.ToString() + "\n");
		    myHouse = myContractor.orderAhouse("Office");
            Console.WriteLine(myHouse.ToString() + "\n");
		    myHouse = myContractor.orderAhouse("Resident");
            Console.WriteLine(myHouse.ToString() + "\n");
            Console.ReadLine();
        }
    }
}
