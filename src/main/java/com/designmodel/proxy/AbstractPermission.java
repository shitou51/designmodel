package com.designmodel.proxy;

public interface AbstractPermission {
	public void modifyUserInfo();

	public void viewNode();

	public void pubishNode();

	public void modifyNode();

	public void setLevel(int level);
}
