using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StrategyPattern
{
    public class BattleShip : Ship{

	public BattleShip(string aName): base(aName) {

        Console.WriteLine("A Battle ship is created");
		work=new HeavyArtillery();
	}
}
}
