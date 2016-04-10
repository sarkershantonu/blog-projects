using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Template
{
   public class ConsumerLoan : Loan{

	public override void checkAllAccountStatement() {
		Console.WriteLine("Checking all bank account statement for Consumer Loan");		
	}
	public override void checkBusiness() {
		Console.WriteLine("Checking Business for Consumer Loan");
	}
	public override void checkEmployment() {
		Console.WriteLine("Checking Employment for Consumer Loan");
	}
	public override void checkPeoperty() {}
	public override void checkBankSolvency() {	}

	public new bool needCheckProperty(){return false;}
	public new bool needCheckBankSolvency(){return false;}
}
}
