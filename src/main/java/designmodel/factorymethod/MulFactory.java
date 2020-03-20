package designmodel.factorymethod;

import designmodel.simplefactory.Operation;
import designmodel.simplefactory.OperationMul;

public class MulFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
