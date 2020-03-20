package com.designmodel.mediator;

public class CommonMember extends Member {

	public CommonMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String to, String text) {
		System.out.println("普通会员发送信息");
		this.chatroom.sendText(this.name, to, text);

	}

	@Override
	public void sendImage(String to, String image) {
		System.out.println("普通会员不能发送图片");
	}

}
