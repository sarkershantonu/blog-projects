using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BuilderPattern
{
    class MobileMakerAsDirector
    {
        private IMobileBuilder myBuilder;
        public MobileMakerAsDirector(IMobileBuilder aBuilder)
        {
            myBuilder = aBuilder;
        }
        public Mobile GetMobile()
        {
            return myBuilder.Mobile;
        }
        public void BuildAMobile()
        {
            myBuilder.BuildDisplayUnit();
            myBuilder.BuildSpeaker();
            myBuilder.BuildMic();
            myBuilder.BuildNetwrkRadio();
            myBuilder.BuildKeypad();
        }
    }
}
