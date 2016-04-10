using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Template
{
    public class HouseLoan : Loan{	
	public override void checkBankSolvency() {
        Console.WriteLine("Checking Bank Solvency for house Loan");		
	}
    public override void checkPeoperty()
    {
        Console.WriteLine("Checking Property for house Loan");
	}
    public override void checkAllAccountStatement() { }
    public override void checkBusiness() { }
    public override void checkEmployment() { }
    public new bool needCheckEmployment() { return false; }
    public new bool needCheckBusiness() { return false; }
    public new bool needCheckAllAccountStatement() { return false; }
}
}
