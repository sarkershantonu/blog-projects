using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;

namespace MediatorDesignPattern
{
    class SchoolingMediator:IMediator
    {
        private List<Knowledge> allTeachingOffers = null;
        private List<Knowledge> alllearningRequests = null;
        private List<Employee> allEmployees = null;
        private int employeeCode = 0;

        public SchoolingMediator()
        {
            allTeachingOffers = new List<Knowledge>();
            alllearningRequests = new List<Knowledge>();
            allEmployees = new List<Employee>();
        }
        public void AddEmployee(Employee anEmployee)
        {
            allEmployees.Add(anEmployee);
            employeeCode++;
            anEmployee.EmployeeCode = employeeCode;
        }
        public void GetAllTrainings()
        {
		    Console.WriteLine("\nThese are Teaching Offers ");
		    foreach(var aKnolwdge in allTeachingOffers)
            {
			    Console.WriteLine(aKnolwdge.Subject+" for "+aKnolwdge.Hour+" Hrs");
		    }
		    Console.WriteLine("\nThese are learning Requests ");
		    foreach(var aKnolwdge in alllearningRequests)
            {
			    Console.WriteLine(aKnolwdge.Subject+" for "+aKnolwdge.Hour+" Hrs");
            }
        }
        public void GiveKnowledge(string subject, int hour, int employeeCode)
        {
            bool knowledgeGiven = false;
		    foreach (var aTeachingingSubject in alllearningRequests)
            {
			    //now, we check if requested learning subject and hour matches any of available Teaching subject and hour
			    if((aTeachingingSubject.Subject==subject)&&(aTeachingingSubject.Hour==hour)){
                    Console.WriteLine("\n" + hour.ToString() + " hour(s) subject \"" + subject + "\" is taught by ID " + employeeCode.ToString() + " , and learned by id " + aTeachingingSubject.EmployeeCode.ToString());
				    alllearningRequests.Remove(aTeachingingSubject);//removing learned subject
				    knowledgeGiven=true;
			    }
                if (knowledgeGiven)//if any one give the knowledge
                {
				    break;
			    }
		    }
            if (!knowledgeGiven)//if no knowledge is given , it will be added in Teaching offers
            {
                Console.WriteLine(subject + " is added in the Teaching offers and time(hrs) is " + hour.ToString());
			    allTeachingOffers.Add(new Knowledge(subject, hour, employeeCode));
            }
        }
        public void GetKnowledge(string subject, int hour, int employeeCode)
        {
            bool knowledgeLearn = false;
            foreach( var aLearningSubject in allTeachingOffers)
            {
            //now, we check if requested learning subject and hour matches any of available Teaching subject and hour
                if(aLearningSubject.Subject==subject&&aLearningSubject.Hour==hour)
                {
                    Console.WriteLine("\n" + hour.ToString() + " hour(s) subject \"" + subject + "\" is learned by ID " + employeeCode.ToString() + " , and taught by id " + aLearningSubject.EmployeeCode.ToString());
	                allTeachingOffers.Remove(aLearningSubject);//removing learned subject
	                knowledgeLearn=true;
                }
                if(knowledgeLearn)
                {//if any one get the knowledge
	                break;
                }
            }
            if(!knowledgeLearn)
            {//if no knowledge is delivered , it will be added in learning requests.
                Console.WriteLine(subject + " is added in the learning requests and time(hrs) is " + hour.ToString());
                alllearningRequests.Add(new Knowledge(subject, hour, employeeCode));
            }	
        }       
    }
}
