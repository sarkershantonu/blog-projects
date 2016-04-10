using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StrategyPattern
{
   public class PassengerShip : Ship {

	public PassengerShip(string aName): base(aName) {
		Console.WriteLine("A passenger ship is created");
		work=new People();
	}

}
}
