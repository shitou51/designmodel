package designmodel.template;

public abstract class BankTemplateMethod {
	public void takeNumber() {
		System.out.println("取号排队");
	}

	public abstract void transact();

	public void evaluate() {
		System.out.println("反馈评分");
	}

	public void process() {
		takeNumber();
		transact();
		evaluate();
	}
}
