using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Facade
{
    class Program
    {
        static void Main(string[] args)
        {
            Student aSudent = new Student();
            ReportCardFacade studentReport = new ReportCardFacade(aSudent);
            studentReport.GetResultCard();
            Console.ReadLine();
        }
    }
}
