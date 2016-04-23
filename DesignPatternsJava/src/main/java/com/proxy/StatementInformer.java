package com.proxy;

public class StatementInformer implements IBalanceInformation{
	IBalanceInformation myAcccount = null;
	public StatementInformer() {
	}
	public StatementInformer(IBalanceInformation account) {
		myAcccount=account;
	}
	public double getBalance() {
		if(myAcccount==null){
			myAcccount = new Account();
		}		
		return myAcccount.getBalance();
	}
	public String lastAccesDate()
	{
		Account aRealaccount = new Account();
		return aRealaccount.getLastAccessDate(); 
	}
}
