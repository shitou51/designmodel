package com.designmodel.command;

public class TVChangeCommand extends AbstractCommand {
	private Television tv;

	public TVChangeCommand() {
		tv = new Television();
	}

	@Override
	public void execute() {
		tv.changeChannel();
	}

}
