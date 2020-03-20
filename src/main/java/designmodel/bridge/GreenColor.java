package designmodel.bridge;

public class GreenColor implements Color {

	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "绿色的" + name + ".");

	}

}
