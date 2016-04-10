using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AdapterPattern
{
   public class FullTimeEmployee : IEmployee {
	private string name;

    public string Name
    {
        get
        {
            return name;
        }
	}

	public FullTimeEmployee(string aName){
		name=aName;
	}
	
	public void AttenOffice() {
        Console.WriteLine(Name + " is in office now");	
	}

	public void JoinMeeting() {
        Console.WriteLine(Name + " is joining today's meeting");	
		
	}
	public void GetDailyReport() {
        Console.WriteLine(Name + " is providing reports for today");	
	}

}
}
