using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Template
{
    class Program
    {
        static void Main(string[] args)
        {
            HouseLoan homeLoan = new HouseLoan();
		    StudyLoan studentLoan = new StudyLoan();
		    ConsumerLoan televisionLoan = new ConsumerLoan();
		    Console.WriteLine("Providing a Home Loan has been started");
		    homeLoan.provideLoan();
		    Console.WriteLine("\nProviding a Student Loan has been started");
		    studentLoan.provideLoan();
		    Console.WriteLine("\nProviding a Consumer Loan has been started");
		    televisionLoan.provideLoan();
            Console.ReadLine();	
        }
    }
}
