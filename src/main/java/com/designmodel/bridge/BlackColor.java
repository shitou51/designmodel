package com.designmodel.bridge;

public class BlackColor implements Color{
	
	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "黑色的" + name + ".");
		
	}

}
