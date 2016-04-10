using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Facade
{
    public class Attendance
    {
        private Student student;
        private double attendance = 85.6;
        public Attendance(Student aStudent)
        {
            student = aStudent;
        }
        public void GetStudentAttendance(){
            Console.WriteLine(student.Name + "'s attendance = " + attendance.ToString("#.##") + " percentage");
	}
    }
}
