using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Facade
{
    public class ReportCardFacade
    {
        private Student student;
        private Results studentResult;
        private Behavior studentBehavior;
        private Attendance studentAttendance;
        public ReportCardFacade(Student aStudent)
        {
            student = aStudent;
            studentResult = new Results(aStudent);
            studentBehavior = new Behavior(aStudent);
            studentAttendance = new Attendance(aStudent);
        }
        public void GetResultCard() {
		Console.WriteLine("This is result of "+student.Name+" Who's date of birth is "+student.DateOfBirth);
		studentResult.GetStudentResult();
		studentAttendance.GetStudentAttendance();
		studentBehavior.GetStudentBehavior();
	}
    }
}
