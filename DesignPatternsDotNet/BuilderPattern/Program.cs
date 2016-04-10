using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BuilderPattern
{
    class Program
    {
        static void Main(string[] args)
        {
            IMobileBuilder aBuilder = new MobileBuilder();
		    MobileMakerAsDirector aMaker = new MobileMakerAsDirector(aBuilder);
            aMaker.BuildAMobile();
            Mobile aMobile = aMaker.GetMobile();
		    Console.WriteLine("A Mobile is ordered to build");
		    Console.WriteLine("The Mobile Keypad = "+aMobile.Keypad);
		    Console.WriteLine("The Mobile Display = "+aMobile.Display);
		    Console.WriteLine("The Mobile Netwrk = "+aMobile.Network);
		    Console.WriteLine("The Mobile Speaker = "+aMobile.Speaker);
            Console.WriteLine("The Mobile Mic = " + aMobile.Mike);
            Console.ReadLine();
        }
    }
}
