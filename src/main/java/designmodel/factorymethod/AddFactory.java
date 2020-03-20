package designmodel.factorymethod;

import designmodel.simplefactory.Operation;
import designmodel.simplefactory.OperationAdd;

public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}

}
