package designmodel.command;

public class TVCloseCommand extends AbstractCommand {
	private Television tv;

	public TVCloseCommand() {
		tv = new Television();
	}

	@Override
	public void execute() {
		tv.close();
	}

}
