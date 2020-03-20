package com.designmodel.state;

public class HightState extends AbstractState {

	public HightState(AbstractState state) {
		this.acc = state.getAcc();
		this.point = state.getPoint();
		this.stateName = "专家";

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
			this.point += score*2;
		}

	}

	@Override
	public void downloadFile(int score) {
		System.out.println(acc.getName() + "下载文件,扣除" + score + "/2积分");
		this.point -= score / 2;
		checkState(point);
		System.out.println("剩余积分为：" + this.point + ",当前级别为" + acc.getState().stateName + "。");
	}

	@Override
	public void writeNote(int score) {
		System.out.println(acc.getName() + "发布留言，增加" + score + "*2积分");
		this.point += score * 2;
		checkState(point);
		System.out.println("剩余积分为：" + this.point + ",当前级别为" + acc.getState().stateName + "。");
	}

}
