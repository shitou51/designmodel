package com.designmodel.base;

public class Bird extends Animal {

	private Wing wing;

	/**
	 * 在鸟Bird类中，初始化时，实例化翅膀Wing，他们之间同时生成
	 */
	public Bird() {
		wing = new Wing();
	}

	public Plume plume;
	public FootAuality footAuality;

	public void egg() {
	}

}
