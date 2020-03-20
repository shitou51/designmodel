package com.designmodel.visitor;

public class Customer extends Visitor {

	@Override
	public void visit(Apple apple) {
		System.out.println("顾客" + this.getName() + "选苹果");

	}

	@Override
	public void visit(Book book) {
		System.out.println("顾客" + this.getName() + "选书籍");

	}

}
