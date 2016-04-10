using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MediatorDesignPattern
{
    class Knowledge
    {
        private string subject = "Not Selected";
        private int hour = 0;
        private int employeeCode = 0;
        public Knowledge(string sub, int hr, int code)
        {
            subject = sub;
            hour = hr;
            employeeCode = code;
        }
        public string Subject
        {
            get
            {
                return subject;
            }
        }
        public int Hour
        {
            get
            {
                return hour;
            }
        }
        public int EmployeeCode
        {
            get
            {
                return employeeCode;
            }
        }
    }
}
