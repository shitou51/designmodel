package designmodel.bridge;

public class BigPen extends Pen{

	@Override
	public void draw(String name) {
		this.color.bepaint("大号毛笔绘制", name);
		
	}

}
