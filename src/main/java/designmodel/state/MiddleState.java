package designmodel.state;

public class MiddleState extends AbstractState {

	public MiddleState(AbstractState state) {
		this.point = state.getPoint();
		this.acc = state.getAcc();
		this.stateName = "中级";
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

	@Override
	public void writeNote(int score) {
		System.out.println(getAcc().getName() + "发布留言，增加" + score + "*2个积分");
		this.point += score * 2;
		checkState(point);
		System.out.println("剩余积分为：" + this.point + ",当前级别为" + this.acc.getState().stateName + "。");
	}

}
