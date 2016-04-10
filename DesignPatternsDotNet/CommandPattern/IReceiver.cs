using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CommandPattern
{
    public interface IReceiver
    {
         void Home();
         void On();
         void Off();
         void VolumeUp();
         void VolumeDowne();
         void Back();
    }
}
