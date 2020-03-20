package designmodel.observer;

public class Client {
	public static void main(String[] args) {
		MySubject subject  = new Cat();
		subject.attach(new Dog());
		subject.attach(new Mouse());
		
		subject.cry(); 
	}
}
