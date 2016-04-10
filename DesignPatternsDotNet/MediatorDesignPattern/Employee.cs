using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MediatorDesignPattern
{
    public abstract class Employee
    {
        private IMediator mediator;
        private int employeeCode = 0;
        public Employee(IMediator aMeadiator)
        {
            mediator = aMeadiator;
            mediator.AddEmployee(this);
        }
        public void TeachingOffer(String subject, int time)
        {//Teaches
            mediator.GiveKnowledge(subject, time, employeeCode);
        }
        public void LearningRequests(String subject, int time)
        {//learns
            mediator.GetKnowledge(subject, time, employeeCode);
        }
        public int EmployeeCode
        {
            set
            {
                employeeCode = value;
            }
        }
    }
}
