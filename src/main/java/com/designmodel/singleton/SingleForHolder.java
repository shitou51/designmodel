package com.designmodel.singleton;

/**
 * 内部类单例
 * https://cloud.tencent.com/developer/article/1486351
 * @author shitou
 *
 */
public class SingleForHolder {
	public static class SingleHolder {
		private static final SingleForHolder instance = new SingleForHolder();
	}

	public static SingleForHolder getInstance() {
		return SingleHolder.instance;
	}

}
