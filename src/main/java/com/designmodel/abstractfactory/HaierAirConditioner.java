package com.designmodel.abstractfactory;

public class HaierAirConditioner implements AirConditioner {

	@Override
	public void changeTemperature() {
		System.out.println("Haier空调温度改变中");

	}

}
