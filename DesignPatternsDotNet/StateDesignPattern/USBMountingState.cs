using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StateDesignPattern
{
    public class USBMountingState : IState
    {
        private IMobile myMobile;
        public USBMountingState(IMobile aMobile)
        {
            myMobile = aMobile;
        }
        public void Charge()
        {
            Console.WriteLine("While USB Only mode, your device is by default charging");
            myMobile.State = myMobile.GetCharging();
        }
        public void UsbMount()
        {
            Console.WriteLine("Deviec is in USB mode, access mobile storage from file explorer");
        }
        public void AdbConnect()
        {
            Console.WriteLine("While USB Only mode we can not access ADB , please select Android Debugging from Device settings");
            myMobile.State = myMobile.GetAdb();
        }
    }
}
