package designmodel.abstractfactory;

public class HaierFactory implements EFactory {

	@Override
	public Television produceTelevison() {
		return new HaierTelevision();
	}

	@Override
	public AirConditioner produceAirConditioner() {
		return new HaierAirConditioner();
	}

}
