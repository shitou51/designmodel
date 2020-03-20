package com.designmodel.factorymethod;

import com.designmodel.simplefactory.Operation;
import com.designmodel.simplefactory.OperationDiv;

public class DivFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
