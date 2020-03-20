package com.designmodel.adapter;

public class Client {
	public static void main(String[] args) {
		DataOperator dao = new CipherAdapter();
		dao.setPassword("sunnyLiu");
		String ps = dao.getPassword();
		String es = dao.doEncrypt(6, ps);

		System.out.println("明文：" + ps);
		System.out.println("密文：" + es);

		DataOperator dao1 = new NewCipherAdapter();
		dao1.setPassword("sunnyLiu");
		String ps1 = dao1.getPassword();
		String es1 = dao1.doEncrypt(6, ps1);

		System.out.println("明文：" + ps1);
		System.out.println("密文：" + es1);
	}
}
