package com.infinite.test;

//Program to create account and withdraw/deposit Money from that account
/**
 * @author narend
 *
 */
public class Account {
	// Initialization
	String accountId;
	String accountName;
	String address;
	double balance;
	double depositAmount;
	double withdrawAmount;
	String loanType;

	public Account(String accountId, String accountName, String address) {

		this.accountId = accountId;
		this.accountName = accountName;
		this.address = address;

	}

	public void depositAmount(double amount) { // to deposit amount

		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Amount Depositing: " + amount + " into account: " + accountName);
		} else {
			System.out.println("Invalid Amount");
		}
	}

	public void withdrawAmount(double amount) { // to withdraw amount
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Amount Withdrawing: " + amount + " Balance left: " + balance);
		} else if (amount > balance) {
			System.out.println("Invalid Withdraw amount: withdraw more than balance");
		} else if (amount < 0) {
			System.out.println("Invalid Amount");
		}
	}

	public void displayAccDetails() { // display account details
		System.out.println("Account ID: " + accountId);
		System.out.println("Account Name: " + accountName);
		System.out.println("Address: " + address);

	}

	public static void main(String[] args) { // main method
		Account[] acc = new Account[10];

		acc[0] = new Account("1000001-AAAA", "Naren", "Vizag"); // to insert account details
																
		acc[1] = new Account("1000002-AAAB", "Sam", "USA");

		acc[0].depositAmount(2250); // deposit Amount
		acc[1].depositAmount(5000);
		acc[0].withdrawAmount(1000); // withdraw amount

		acc[0].displayAccDetails();
	}
}
