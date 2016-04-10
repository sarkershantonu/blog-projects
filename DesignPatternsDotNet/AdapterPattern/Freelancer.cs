using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AdapterPattern
{
    public class Freelancer
    {
        private string name;
        public string Name
        {
            get
            {
                return name;
            }
        }
        public void StartWork(){
		Console.WriteLine(Name+" has started work remotely");	
	}
        public void RemoteConversation(){
            Console.Write("\n" + Name + " has started remote conversation");
	}
        public void GetReport(string aDate){
            Console.WriteLine(Name + " is providing reports for " + aDate);
	}
        public Freelancer(string aName)
        {
            name = aName;
        }
    }
}
