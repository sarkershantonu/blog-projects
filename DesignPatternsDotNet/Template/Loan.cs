using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Template
{
    public abstract class Loan {
	public abstract void checkAllAccountStatement() ;
	public abstract void checkBankSolvency() ;
	public abstract void checkBusiness() ;
	public abstract void checkEmployment();
	public abstract void checkPeoperty() ;

	public void provideLoan()//the template method
	{
		createBankAccount();		
		if(needCheckProperty()){
			checkPeoperty();
		}
		if(needCheckEmployment()){
			checkEmployment();
		}
		if(needCheckBusiness()){
			checkBusiness();		}
		if(needCheckBankSolvency()){
			checkBankSolvency();
		}
		if(needCheckAllAccountStatement()){
			checkAllAccountStatement();
		}		
		keepAllMonthlyInstallmentChecks();
		sendConfirmation();
	}
	public void sendConfirmation() {
		Console.WriteLine("A loan has been sanctioned");
		
	}
	public void keepAllMonthlyInstallmentChecks() {
		Console.WriteLine("Taking all signed checks for monthly installments");		
	}	
	public void createBankAccount(){
		Console.WriteLine("An account has been created for the loan ");
	}
	//the hooks
	public bool needCheckProperty(){return true;}
    public bool needCheckBankSolvency() { return true; }
    public bool needCheckAllAccountStatement() { return true; }
    public bool needCheckEmployment() { return true; }
    public bool needCheckBusiness() { return true; }
}
}
