package com.designmodel.factorymethod;

import com.designmodel.simplefactory.Operation;
import com.designmodel.simplefactory.OperationMul;

public class MulFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
