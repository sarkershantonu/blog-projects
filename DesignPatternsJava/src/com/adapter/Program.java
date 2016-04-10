package com.adapter;

public class Program {
	public static void main(String[] args) {
		IEmployee aExsistEmployee = new FullTimeEmployee("Mr. David");
		Freelancer aFreelancer = new Freelancer("Shantonu Sarker");
		IEmployee adapter = new FreelancerAdapter(aFreelancer);
		System.out.println("\n"+"This is sytem exist full time employee");
		aExsistEmployee.attenOffice();
		aExsistEmployee.joinMeeting();
		aExsistEmployee.getDailyReport();
		
		System.out.println("\n"+"This is new freelancer");
		aFreelancer.startWork();
		aFreelancer.remoteConversation();
		
		System.out.println("\n"+"This is freelancer and frelancerAdapter");
		adapter.attenOffice();
		adapter.getDailyReport();
		adapter.joinMeeting();	
	}
}
