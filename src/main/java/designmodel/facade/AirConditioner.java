package designmodel.facade;

public class AirConditioner {
	private String position;

	public AirConditioner(String position) {
		super();
		this.position = position;
	}

	public void on() {
		System.out.println("打开空调");
	}

	public void off() {
		System.out.println("关闭空调");
	}

}
