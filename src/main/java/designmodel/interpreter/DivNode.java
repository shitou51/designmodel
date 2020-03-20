package designmodel.interpreter;

public class DivNode extends SymbolNode {

	public DivNode(Node left, Node right) {
		super(left, right);
	}

	@Override
	public int interpret() {
		if (right.interpret() == 0) {
			return 0;
		}
		return left.interpret() / right.interpret();
	}

}
