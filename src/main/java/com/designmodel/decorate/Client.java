package com.designmodel.decorate;

public class Client {
	public static void main(String[] args) {
		Transform camaro;
		camaro = new Car();
		camaro.move();
		System.out.println("---------------");

		Robot bumblebee = new Robot(camaro);
		bumblebee.move();
		bumblebee.say();

		System.out.println("---------------");
		
		Airplane bumblebeeAir = new Airplane(camaro);
		bumblebeeAir.move();
		bumblebeeAir.fly();
	}
}
