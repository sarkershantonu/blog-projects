using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StateDesignPattern
{
    //Context Interface
    public interface IMobile
    {
        IState State
        {
            set;
        }
        void ChargeMobile();
        void USBConnect();
        void AdbAccess();
        IState GetCharging();
        IState GetUsb();
        IState GetAdb();
    }
}
