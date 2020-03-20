package com.designmodel.factorymethod;

import com.designmodel.simplefactory.Operation;
import com.designmodel.simplefactory.OperationAdd;

public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}

}
