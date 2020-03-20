package com.designmodel.mediator;

import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom {

	private Hashtable<String, Member> members = new Hashtable<String, Member>();

	@Override
	public void register(Member member) {
		if (!members.containsKey(member.getName())) {
			members.put(member.getName(), member);
			member.setChatroom(this);
		}

	}

	@Override
	public void sendText(String from, String to, String text) {
		Member toMember = members.get(to);
		String newMessage = text;
		newMessage = newMessage.replace("日", "*");
		toMember.receiveText(from, newMessage);

	}

	@Override
	public void sendImage(String from, String to, String image) {
		Member toMember = members.get(to);
		toMember.receiveImage(from, image);
	}

}
