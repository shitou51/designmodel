package designmodel.factorymethod;

import designmodel.simplefactory.Operation;
import designmodel.simplefactory.OperationDiv;

public class DivFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
