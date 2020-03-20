package com.designmodel.interpreter;

import java.util.Stack;

public class Calculator {
	private String statement;
	private Node node;

	public void build(String statement) {
		Node left = null;
		Node right = null;
		Stack<Node> stack = new Stack();
		String[] statementArr = statement.split(" ");
		for (int i = 0; i < statementArr.length; i++) {
			if (statementArr[i].equals("*")) {
				left = stack.pop();
				right = new ValueNode(Integer.valueOf(statementArr[++i]));
				stack.push(new MulNode(left, right));
			} else if (statementArr[i].equals("/")) {
				left = stack.pop();
				right = new ValueNode(Integer.valueOf(statementArr[++i]));
				stack.push(new DivNode(left, right));
			} else if (statementArr[i].equals("%")) {
				left = stack.pop();
				right = new ValueNode(Integer.valueOf(statementArr[++i]));
				stack.push(new ModNode(left, right));
			} else {
				stack.push(new ValueNode(Integer.valueOf(statementArr[i])));
			}
		}
		node = stack.pop();
	}

	public int compute() {
		return node.interpret();
	}
}
