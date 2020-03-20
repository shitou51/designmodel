package com.designmodel.bridge;

public class MiddlePen extends Pen {

	@Override
	public void draw(String name) {
		this.color.bepaint("中号毛笔绘制", name);
		
	}

}
