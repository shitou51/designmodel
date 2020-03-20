package designmodel.mediator;

public abstract class AbstractChatroom {
	public abstract void register(Member member);

	public abstract void sendText(String from, String to, String text);

	public abstract void sendImage(String from, String to, String image);
}
