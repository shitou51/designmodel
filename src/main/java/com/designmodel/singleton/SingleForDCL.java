package com.designmodel.singleton;

/**
 * 双重检查单例
 * https://cloud.tencent.com/developer/article/1486351
 * @author shitou
 *
 */
public class SingleForDCL {
	private static volatile SingleForDCL singleForDCL = null;

	private SingleForDCL() {
	}

	public static SingleForDCL getSingleForDCL() {
		if (singleForDCL == null) {
			synchronized (SingleForDCL.class) {
				if (singleForDCL == null) {
					singleForDCL = new SingleForDCL();
				}
			}
		}
		return singleForDCL;
	}
}
