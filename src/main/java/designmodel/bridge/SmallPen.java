package designmodel.bridge;

public class SmallPen extends Pen {

	@Override
	public void draw(String name) {
		
		this.color.bepaint("小号毛笔绘制", name);
	}

}
