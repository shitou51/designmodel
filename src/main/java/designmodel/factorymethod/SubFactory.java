package designmodel.factorymethod;

import designmodel.simplefactory.Operation;
import designmodel.simplefactory.OperationSub;

public class SubFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}
