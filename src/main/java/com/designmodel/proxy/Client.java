package com.designmodel.proxy;

public class Client {
	public static void main(String[] args) {
		AbstractPermission permission = new PermissionProxy();
		permission.setLevel(0);
		permission.viewNode();
		permission.modifyNode();
		permission.modifyUserInfo();
		permission.pubishNode();

		permission.setLevel(1);
		permission.viewNode();
		permission.modifyNode();
		permission.modifyUserInfo();
		permission.pubishNode();
	}
}
