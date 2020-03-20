package designmodel.base;

public abstract class Animal {
	public boolean living;

	public void metabolism(Oxygen o2, Water water) {
	}

	public Animal breed() {
		return new Animal() {
		};
	}
}
