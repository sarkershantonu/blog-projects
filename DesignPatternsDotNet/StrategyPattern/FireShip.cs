using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StrategyPattern
{
    public class FireShip : Ship{

	public FireShip(string aName) : base(aName){
        Console.WriteLine("A fire ship is created");
		work=new HeavyArtillery();
	}
}
}
