package designmodel.bridge;

public class RedColor implements Color{
	
	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "红色的" + name + ".");
		
	}

}
