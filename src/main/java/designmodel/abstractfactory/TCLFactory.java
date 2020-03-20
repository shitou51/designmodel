package designmodel.abstractfactory;

public class TCLFactory  implements EFactory{

	@Override
	public Television produceTelevison() {
		return new TCLTelevision();
	}

	@Override
	public AirConditioner produceAirConditioner() {
		return new TCLAirConditioner();
	}

}
