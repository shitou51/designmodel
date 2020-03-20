package com.designmodel.singleton;

/**
 * 枚举单例
 * https://cloud.tencent.com/developer/article/1486351
 * @author shitou
 *
 */
public enum SingleForEnum {
	INSTANCE;

	S1 s1 = null;

	private SingleForEnum() {
		s1 = new S1();
	}

	S1 getS1() {
		return s1;
	}

	public static void main(String[] args) {
		SingleForEnum.INSTANCE.s1.pt();
	}
}

class S1 {
	public void pt() {
		System.out.print("pt");
	}
}