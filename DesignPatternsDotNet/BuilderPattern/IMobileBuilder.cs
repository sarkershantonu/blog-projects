using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BuilderPattern
{
    interface IMobileBuilder
    {
        void BuildKeypad();
        void BuildSpeaker();
        void BuildDisplayUnit();
        void BuildMic();
        void BuildNetwrkRadio();
        Mobile Mobile
        {
            get;
        }
    }
}
