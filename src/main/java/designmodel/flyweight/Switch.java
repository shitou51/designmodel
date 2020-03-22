package designmodel.flyweight;

public class Switch implements NetworkDevice {
	private String type;

	public Switch(String type) {
		this.type = type;
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public void use(Port port) {
		System.out.println("Linked by Switch , type is " + this.type + ",port is " + port.getPort());
	}

}
