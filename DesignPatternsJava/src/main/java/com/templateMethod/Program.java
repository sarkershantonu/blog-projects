package com.templateMethod;

public class Program {

	public static void main(String[] args) {
		HouseLoan homeLoan = new HouseLoan();
		StudyLoan studentLoan = new StudyLoan();
		ConsumerLoan televisionLoan = new ConsumerLoan();
		System.out.println("Providing a Home Loan has been started");
		homeLoan.provideLoan();
		System.out.println("\nProviding a Student Loan has been started");
		studentLoan.provideLoan();
		System.out.println("\nProviding a Consumer Loan has been started");
		televisionLoan.provideLoan();
	}

}
