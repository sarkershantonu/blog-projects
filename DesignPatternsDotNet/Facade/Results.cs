using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Facade
{
    public class Results
    {
        private Student student;
        private double totalMarks = 1000.00;
        public Results(Student aStudent)
        {
            student = aStudent;
        }
        public void GetStudentResult(){
		Console.WriteLine(student.Name+"'s Result = "+totalMarks.ToString("#.##")+" Marks");
	}
    }
}
