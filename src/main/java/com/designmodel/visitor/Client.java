package com.designmodel.visitor;

public class Client {
	public static void main(String[] args) {
		Product p1 = new Apple();
		Product p2 = new Book();

		BuyBasket buyBasket = new BuyBasket();
		buyBasket.addProduct(p1);
		buyBasket.addProduct(p2);

		Visitor v1 = new Customer();
		v1.setName("顾客");
		buyBasket.accept(v1);

		Visitor v2 = new Saler();
		v2.setName("收银员");
		buyBasket.accept(v2);
	}
}
