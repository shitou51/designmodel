package com.designmodel.compsite;

public class File extends AbstractElement {
	private String name;

	public File(String name) {
		super();
		this.name = name;
	}

	@Override
	void add(AbstractElement element) {
		System.out.println("不支持的操作");
	}

	@Override
	void remove(AbstractElement element) {
		System.out.println("不支持的操作");
	}

	@Override
	AbstractElement get(int i) {
		System.out.println("不支持的操作");
		return null;
	}

	@Override
	void method() {
		System.out.println("名称："+name);

	}

}
