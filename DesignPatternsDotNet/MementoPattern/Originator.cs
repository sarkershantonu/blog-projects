using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MementoPattern
{
    class Originator
    {
        private string state = "Originator state";
        public void Set(String aState){
		state=aState;
        Console.WriteLine("State from originator: " + state);
	}
        public Memento Store(){
            Console.WriteLine("memento created from originator");
		return new Memento(state);
	}
        public String Restore(Memento aMemento){
            Console.WriteLine("memento set from originator");
            state = aMemento.State;
		return state;
	}
    }
}
