package com.example.demo;

public class Account {
	private double balance;

	public Account(double initialBalance) {
		this.balance = initialBalance;
	}

	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}

	public double getBalance() {
		return this.balance;
	}
}