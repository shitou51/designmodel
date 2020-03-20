package designmodel.adapter;

public class CipherAdapter extends DataOperator {
	private Caesar caesar;

	public CipherAdapter() {
		caesar = new Caesar();
	}

	@Override
	String doEncrypt(int key, String ps) {
		String data = caesar.doEncrypt(key, ps);
		return data;
	}

}
