package designmodel.facade;

public class GeneralSwitchFacade {
	private Light[] lights;
	private Fan fan;
	private AirConditioner ac;
	private Television tv;

	public GeneralSwitchFacade() {
		lights = new Light[4];
		lights[0] = new Light();
		lights[1] = new Light();
		lights[2] = new Light();
		lights[3] = new Light();

		fan = new Fan();
		ac = new AirConditioner("客厅");
		tv = new Television();
	}

	public void on() {
		lights[0].on();
		lights[1].on();
		lights[2].on();
		lights[3].on();
		fan.on();
		ac.on();
		tv.on();
	}

	public void off() {
		lights[0].off();
		lights[1].off();
		lights[2].off();
		lights[3].off();
		fan.off();
		ac.off();
		tv.off();
	}

}
