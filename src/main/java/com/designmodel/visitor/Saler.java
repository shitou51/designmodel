package com.designmodel.visitor;

public class Saler extends Visitor {

	@Override
	public void visit(Apple apple) {
		System.out.println("收银员" + this.getName() + "给苹果过程，然后就按其价格");

	}

	@Override
	public void visit(Book book) {
		System.out.println("收银员" + this.getName() + "直接计算书的价格");

	}

}
