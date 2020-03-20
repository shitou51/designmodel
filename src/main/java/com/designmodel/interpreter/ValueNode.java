package com.designmodel.interpreter;

public class ValueNode implements Node {
	private int value;

	public ValueNode(int value) {
		super();
		this.value = value;
	}

	@Override
	public int interpret() {

		return value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
