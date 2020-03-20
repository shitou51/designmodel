package com.designmodel.template;

public class Client {
	public static void main(String[] args) {
		BankTemplateMethod bank = new Deposit();
		bank.process();

		bank = new Withdraw();
		bank.process();

		bank = new Transfer();
		bank.process();
	}
}
