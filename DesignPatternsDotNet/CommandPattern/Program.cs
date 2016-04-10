using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using CommandPattern.Commands;

namespace CommandPattern
{
    class Program
    {
        static void Main(string[] args)
        {
            MobileReceiver aMobile = Mobile.GetAMobile();
            ICommand command = new TurnMobileOn(aMobile);
            MobileButtonInvoker invoker = new MobileButtonInvoker(command);
            invoker.Press();
            command = new PressHome(aMobile);
            invoker = new MobileButtonInvoker(command);
            invoker.Press();
            command = new PressBack(aMobile);
            invoker = new MobileButtonInvoker(command);
            invoker.Press();
            command = new VolumeUp(aMobile);
            invoker = new MobileButtonInvoker(command);
            invoker.Press();
            invoker.Press();
            invoker.PressBack();
            command = new VolumeDown(aMobile);
            invoker = new MobileButtonInvoker(command);
            invoker.Press();
            command = new TurnMobileOff(aMobile);
            invoker = new MobileButtonInvoker(command);
            invoker.Press();
            invoker.PressBack();
            Console.ReadLine();
        }
    }
}
