package com.designmodel.abstractfactory;

public class Client {
	public static void main(String[] args) {
		try {
			EFactory factory = null;
			Television tv = null;
			AirConditioner ac = null;
			factory = new TCLFactory();
			tv = factory.produceTelevison();
			ac = factory.produceAirConditioner();
			tv.play();
			ac.changeTemperature();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
