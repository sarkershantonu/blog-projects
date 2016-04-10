using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Facade
{
    public class Student
    {
        private string name = "Shantonu";
        private string dateOfBirth = "5 jan 1986";
        public string Name
        {
            get
            {
                return name;
            }
            set { name = value; }
        }
        public string DateOfBirth
        {
            get
            {
                return dateOfBirth;
            }
            set { dateOfBirth = value; }
        }
    }
}
