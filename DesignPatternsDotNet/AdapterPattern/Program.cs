using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AdapterPattern
{
    class Program
    {
        static void Main(string[] args)
        {
            IEmployee aExsistEmployee = new FullTimeEmployee("Mr. David");
		    Freelancer aFreelancer = new Freelancer("Shantonu Sarker");
		    IEmployee adapter = new FreelancerAdapter(aFreelancer);
		    Console.WriteLine("\n"+"This is sytem exist full time employee");
		    aExsistEmployee.AttenOffice();
		    aExsistEmployee.JoinMeeting();
		    aExsistEmployee.GetDailyReport();
		
		    Console.WriteLine("\n"+"This is new freelancer");
		    aFreelancer.StartWork();
		    aFreelancer.RemoteConversation();

            Console.WriteLine("\n" + "This is freelancer and frelancerAdapter");
		    adapter.AttenOffice();
		    adapter.GetDailyReport();
		    adapter.JoinMeeting();
            Console.ReadLine();
        }
    }
}
