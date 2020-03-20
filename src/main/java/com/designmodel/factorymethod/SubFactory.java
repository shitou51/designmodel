package com.designmodel.factorymethod;

import com.designmodel.simplefactory.Operation;
import com.designmodel.simplefactory.OperationSub;

public class SubFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}
