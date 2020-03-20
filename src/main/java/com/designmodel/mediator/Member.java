package com.designmodel.mediator;

public abstract class Member {
	protected AbstractChatroom chatroom;
	protected String name;

	public Member(String name) {
		this.name = name;
	}

	public AbstractChatroom getChatroom() {
		return chatroom;
	}

	public void setChatroom(AbstractChatroom chatroom) {
		this.chatroom = chatroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void sendText(String to, String text);

	public abstract void sendImage(String to, String image);

	public void receiveText(String from, String text) {
		System.out.println(from + " 发送文本给" + this.name + ", 内容为：" + text);
	}

	public void receiveImage(String from, String image) {
		System.out.println(from + " 发送图片给" + this.name + ", 内容为：" + image);
	}

}
