package com.designmodel.observer;

public class Cat extends MySubject {

	@Override
	public void cry() {
		System.out.println("猫叫");
		System.out.println("------------------------");
		for (MyObserver obs : observers) {
			obs.response();
		}
	}

}
