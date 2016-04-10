using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CommandPattern
{
    public class Mobile
    {
        public static MobileReceiver GetAMobile()
        {
            return new MobileReceiver();
        }
    }
}
