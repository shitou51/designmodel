package designmodel.bridge;

public class BlueColor implements Color{
	
	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "蓝色的" + name + ".");
		
	}

}
