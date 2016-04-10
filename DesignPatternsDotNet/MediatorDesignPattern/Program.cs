using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MediatorDesignPattern
{
    class Program
    {
        static void Main(string[] args)
        {
            SchoolingMediator kazSchool = new SchoolingMediator();
            Developer myDevs = new Developer(kazSchool);
            Testers myTesters = new Testers(kazSchool);
            Administrators myAdmins = new Administrators(kazSchool);
            myDevs.LearningRequests("QTP", 5);//learning qtp for 5 hours
            myDevs.LearningRequests("SVN Administration", 2);//learning SVN administration for 2 hours
            myDevs.TeachingOffer("Unit Testing", 1);
            myDevs.TeachingOffer("Java", 20);
            myDevs.TeachingOffer("c#", 20);

            myTesters.LearningRequests("Java", 20);
            myTesters.LearningRequests("c#", 10);
            myTesters.TeachingOffer("QTP", 5);
            myTesters.TeachingOffer("Selenium", 5);
            myTesters.TeachingOffer("Session Hacking", 5);

            myAdmins.LearningRequests("Session Hacking", 5);
            myAdmins.LearningRequests("Unit Testing", 1);
            myAdmins.TeachingOffer("SVN Administration", 2);
            myAdmins.TeachingOffer("Linux Administration", 10);
            kazSchool.GetAllTrainings();
            Console.ReadLine();
        }
    }
}
