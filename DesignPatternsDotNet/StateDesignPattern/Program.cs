using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StateDesignPattern
{
    class Program
    {
        static void Main(string[] args)
        {
            IMobile samsungGalaxy = new Android();//initial state will be charging 
            samsungGalaxy.ChargeMobile();
            samsungGalaxy.AdbAccess();//mode will be change to ADB
            samsungGalaxy.AdbAccess();
            samsungGalaxy.USBConnect();//mode will change to USB
            samsungGalaxy.USBConnect();
            Console.Read();
        }
    }
}
