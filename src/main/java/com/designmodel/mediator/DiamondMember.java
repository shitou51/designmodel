package com.designmodel.mediator;

public class DiamondMember extends Member {

	public DiamondMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String to, String text) {
		System.out.println("钻石会员发送信息");
		this.chatroom.sendText(this.name, to, text);

	}

	@Override
	public void sendImage(String to, String image) {
		System.out.println("钻石会员发送图片");
		this.chatroom.sendImage(this.name, to, image);
	}

}
