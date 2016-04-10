using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BuilderPattern 
{
    class MobileBuilder : IMobileBuilder
    {
        private Mobile aMobile=null;
	    public MobileBuilder() {
	       aMobile=new Mobile();
	    }
	public void BuildKeypad(){
		aMobile.Keypad="QWERTY-Pad";
	}
	public void BuildSpeaker(){
		aMobile.Speaker="Loude Speakers ";
	}	
	public void BuildDisplayUnit(){
		aMobile.Display="Touch Display";
	}
	public void BuildMic(){
		aMobile.Mike="High sensored mike";
	}
	public void BuildNetwrkRadio(){
		aMobile.Network="3g Network";
	}
	public Mobile Mobile {
        get { return aMobile; }
	}
}
    
}
