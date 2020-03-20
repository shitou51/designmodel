package designmodel.command;

public class TVOpenCommand extends AbstractCommand {

	private Television tv;

	public TVOpenCommand() {
		tv = new Television();
	}

	@Override
	public void execute() {
		tv.open();

	}

}
