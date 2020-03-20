package com.designmodel.visitor;

public class Book implements Product {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

}
