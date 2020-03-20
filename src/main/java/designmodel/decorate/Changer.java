package designmodel.decorate;

public class Changer implements Transform {
	private Transform transform;

	public Changer(Transform transform) {
		super();
		this.transform = transform;
	}

	@Override
	public void move() {
		transform.move();
	}
	

}
