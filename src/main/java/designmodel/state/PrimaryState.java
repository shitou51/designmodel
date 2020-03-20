package designmodel.state;

public class PrimaryState extends AbstractState {

	public PrimaryState(ForumAccount forumAccount) {
		this.acc = forumAccount;
		this.point = 0;
		this.stateName = "新手";
	}

	public PrimaryState(AbstractState state) {
		this.acc = state.getAcc();
		this.point = state.getPoint();
		this.stateName = "新手";
	}

	@Override
	public void downloadFile(int score) {
		System.out.println("对比起，" + getAcc().getName() + ",您没有下载文件的权限");
	}

	@Override
	public void checkState(int score) {
		if (score >= 1000) {
			acc.setState(new HightState(this));
		} else if (score >= 100) {
			acc.setState(new MiddleState(this));
		} else if (score >= 0) {
			acc.setState(new PrimaryState(this));
		} else {
			System.out.println("余额不足，文件下载失败");
			this.point += score;
		}
	}

}
