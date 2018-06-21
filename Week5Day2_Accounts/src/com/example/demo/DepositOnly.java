package com.example.demo;

public class DepositOnly extends Account {

	public DepositOnly(double initialBalance) {
		super(initialBalance);
	}

	public void addMoney(double money) {
		this.setBalance(this.getBalance() + money);
	}
	
	private double intrestRate = 0.05;
}