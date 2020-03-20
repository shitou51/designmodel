package designmodel.proxy;

public class PermissionProxy implements AbstractPermission {

	private RealPermission permission = new RealPermission();
	int level = 0;

	@Override
	public void modifyUserInfo() {
		if (0 == level) {
			System.out.println("对不起，您没有该权限");
		} else if (1 == level) {
			permission.modifyUserInfo();
		}
	}

	@Override
	public void viewNode() {
		permission.viewNode();

	}

	@Override
	public void pubishNode() {
		if (0 == level) {
			System.out.println("对不起，您没有该权限");
		} else if (1 == level) {
			permission.pubishNode();
		}
	}

	@Override
	public void modifyNode() {
		if (0 == level) {
			System.out.println("对不起，您没有该权限");
		} else if (1 == level) {
			permission.modifyNode();
		}

	}

	@Override
	public void setLevel(int level) {
		this.level = level;

	}

}
