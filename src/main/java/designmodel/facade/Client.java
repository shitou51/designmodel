package designmodel.facade;

public class Client {
	public static void main(String[] args) {
		GeneralSwitchFacade generalSwitchFacade = new GeneralSwitchFacade();
		generalSwitchFacade.on();
		generalSwitchFacade.off();

	}
}
