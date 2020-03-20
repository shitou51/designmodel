package com.designmodel.command;

public class Conroller {
	private AbstractCommand openCommand;
	private AbstractCommand closeCommand;
	private AbstractCommand changeCommand;

	public Conroller(AbstractCommand openCommand, AbstractCommand closeCommand, AbstractCommand changeCommand) {
		super();
		this.openCommand = openCommand;
		this.closeCommand = closeCommand;
		this.changeCommand = changeCommand;
	}

	public void open() {
		openCommand.execute();
	}

	public void close() {
		closeCommand.execute();
	}

	public void change() {
		changeCommand.execute();
	}
}
