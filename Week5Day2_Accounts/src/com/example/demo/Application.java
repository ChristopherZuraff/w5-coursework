package com.example.demo;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DepositOnly myAccount = new DepositOnly(500);
	
myAccount.addMoney(500);

withdrawOnly myAccount2 = new withdrawOnly(1000);
myAccount2.withdrawMoney(2000);
	
	showBalance(myAccount);
	showBalance(myAccount2);
	}
	
	public static void showBalance(Account account) {
		System.out.println(account.getBalance());
	}
	
	
}