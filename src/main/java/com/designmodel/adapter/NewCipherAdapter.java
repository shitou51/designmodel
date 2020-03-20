package com.designmodel.adapter;

public class NewCipherAdapter extends DataOperator {
	private NewCipher newCipher;

	public NewCipherAdapter() {
		this.newCipher = new NewCipher();
	}

	@Override
	String doEncrypt(int key, String ps) {
		String data = newCipher.doEncrypt(key, ps);
		return data;
	}

}
