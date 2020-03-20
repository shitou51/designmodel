package designmodel.compsite;

public abstract class AbstractElement {
	abstract void add(AbstractElement element);

	abstract void remove(AbstractElement element);
	
	abstract AbstractElement get(int i) ;
	
	abstract void method();
}
