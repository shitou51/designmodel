package com.designmodel.memento;

public class UserInfoDTO {
	private String account;
	private String password;
	private String telNo;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public void show() {
		System.out.println("account:" + account + ",password:" + password + ",telNo:" + telNo);
	}

	public Memento saveMemento() {
		return new Memento(account, password, telNo);
	}

	public void restoreMemento(Memento m) {
		this.account = m.getAccount();
		this.password = m.getPassword();
		this.telNo = m.getTelNo();
	}

}
