package designmodel.compsite;

public class Client {
	public static void main(String[] args) {
		AbstractElement root = new Folder();

		AbstractElement folder1 = new Folder();
		folder1.add(new File("file11"));
		folder1.add(new File("file12"));
		root.add(folder1);

		root.add(new File("file1"));

		root.method();

	}
}
