package com.designmodel.bridge;

public class Client {
	public static void main(String[] args) {
		Pen sp = new SmallPen();
		Pen mp = new MiddlePen();
		Pen bp = new BigPen();

		Color black = new BlackColor();
		Color blue = new BlueColor();
		Color green = new GreenColor();
		Color red = new RedColor();
		Color white = new WhiteColor();

		sp.setColor(black);
		sp.draw("鲜花");

		sp.setColor(blue);
		sp.draw("鲜花");

		sp.setColor(green);
		sp.draw("鲜花");

		sp.setColor(red);
		sp.draw("鲜花");

		sp.setColor(white);
		sp.draw("鲜花");

	}
}
