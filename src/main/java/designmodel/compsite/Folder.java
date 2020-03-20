package designmodel.compsite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractElement {
	private List<AbstractElement> list = new ArrayList<AbstractElement>();

	@Override
	void add(AbstractElement element) {
		list.add(element);
	}

	@Override
	void remove(AbstractElement element) {
		list.remove(element);
	}

	@Override
	AbstractElement get(int i) {
		return list.get(i);
	}

	@Override
	void method() {
		for (AbstractElement element : list) {
			element.method();
		}

	}

}
