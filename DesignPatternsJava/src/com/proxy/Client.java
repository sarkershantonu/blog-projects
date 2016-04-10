package com.proxy;

public class Client {
	public static void main(String[] args) {
		IBalanceInformation myInformer = new StatementInformer();
		System.out.println("The account Balance is : "+myInformer.getBalance());
	}
}
