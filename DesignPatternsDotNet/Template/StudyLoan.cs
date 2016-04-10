using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Template
{
    public class StudyLoan : Loan{
	public override void checkBankSolvency() {
		Console.WriteLine("Checking Bank Solvency for Student Loan");
	}	
	public override void checkBusiness() {}	
	public override void checkEmployment() {}	
	public override void checkPeoperty() {}
	public override void checkAllAccountStatement() {}
	public new bool needCheckProperty(){return false;}
	public new bool needCheckAllAccountStatement(){return false;}
	public new bool needCheckEmployment(){return false;}
	public new bool needCheckBusiness(){return false;}
}
}
