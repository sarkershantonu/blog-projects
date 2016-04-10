using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AdapterPattern
{
    public class FreelancerAdapter : IEmployee {
	private Freelancer freelancer = null;
	public FreelancerAdapter(Freelancer aFreelancer){
		freelancer=aFreelancer;
	}
	public void AttenOffice() {
        Console.WriteLine(freelancer.Name + "'s has come to office, his Status : "); 
		freelancer.StartWork();
	}
	public void JoinMeeting() {
		freelancer.RemoteConversation();
        Console.WriteLine(" for meeting");		
	}
	public void GetDailyReport() {

		freelancer.GetReport(DateTime.Now.ToString());
	}
}
}
