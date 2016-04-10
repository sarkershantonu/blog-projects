using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StrategyPattern
{
    class Program
    {
        static void Main(string[] args)
        {
                Ship aFireShip = new FireShip("Fire Ship");
		    //Ship aPassengerShip = new PassengerShip("Passenger Ship");
		    //Ship aBattleShip = new BattleShip("Battle Ship");
		    //Ship aCargoShip = new CargoShip("Cargo Ship");
		    Console.Write("Fire ship is " );
		    aFireShip.GetToWork();
		    aFireShip.SetToWork(new Goods());
            Console.Write("Fire ship is now ");
		    aFireShip.GetToWork();
            Console.ReadLine();
        }
    }
}
