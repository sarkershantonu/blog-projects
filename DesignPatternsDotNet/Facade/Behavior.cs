using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Facade
{
    public class Behavior
    {
        private Student student;
        private string behavior = "Very Polite";
        public Behavior(Student aStudent)
        {
            student = aStudent;
        }
        public void GetStudentBehavior(){
		Console.WriteLine(student.Name+"'s behavior is "+behavior);
	}
    }
}
