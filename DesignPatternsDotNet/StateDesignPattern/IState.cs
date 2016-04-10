using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StateDesignPattern
{
    public interface IState
    {
        void Charge();
        void UsbMount();
        void AdbConnect();
    }

}
