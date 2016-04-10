using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StrategyPattern
{
    public class HeavyArtillery : IStrategyBehaviour{
	public void Carry() {
		Console.WriteLine("carrying heavy artillery");		
	}
}
}
