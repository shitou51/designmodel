package designmodel.command;

public class Client {
	public static void main(String[] args) {
		AbstractCommand open, change, close;
		open = new TVOpenCommand();
		change = new TVChangeCommand();
		close = new TVCloseCommand();

		Conroller conroller = new Conroller(open, close, change);
		conroller.open();
		conroller.change();
		conroller.close();
	}
}
