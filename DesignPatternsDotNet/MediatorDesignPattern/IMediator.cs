using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MediatorDesignPattern
{
    public interface IMediator
    {
        void GiveKnowledge(String subject, int hour, int employeeCode);
        void GetKnowledge(String subject, int hour, int employeeCode);
        void AddEmployee(Employee employee);
    }
}
