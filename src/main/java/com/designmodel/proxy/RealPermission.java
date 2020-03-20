package com.designmodel.proxy;

public class RealPermission implements AbstractPermission {

	@Override
	public void modifyUserInfo() {
		System.out.println("修改用户信息");

	}

	@Override
	public void viewNode() {
		System.out.println("查看帖子");

	}

	@Override
	public void pubishNode() {
		System.out.println("发布帖子");

	}

	@Override
	public void modifyNode() {
		System.out.println("修改帖子");

	}

	@Override
	public void setLevel(int level) {
		
	}

}
