using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StrategyPattern
{
   public class CargoShip : Ship{

	public CargoShip(string aName):base(aName) {
        Console.WriteLine("A cargo ship is created");
		work=new Goods();
	}
}
}
