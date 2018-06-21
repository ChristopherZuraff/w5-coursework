package com.example.demo;

public class withdrawOnly extends Account {
		public withdrawOnly(double initialBalance) {
			super(initialBalance);
		}

	public void withdrawMoney(double money) {
		if(this.getBalance() - money >0) {
		this.setBalance(this.getBalance() - money);
	}else

		{

			System.out.println("Not enough money to withdraw");
		}
	}
}