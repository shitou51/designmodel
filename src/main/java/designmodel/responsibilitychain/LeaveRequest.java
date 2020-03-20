package designmodel.responsibilitychain;

public class LeaveRequest {
	private String levelName;
	private int leaveDays;

	public LeaveRequest(String levelName, int leaveDays) {
		super();
		this.levelName = levelName;
		this.leaveDays = leaveDays;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public int getLeaveDays() {
		return leaveDays;
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}

}
