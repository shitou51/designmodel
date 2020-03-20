package designmodel.strategy;

public class ArrayHandler {
	private Sort sortObj;

	public Sort getSortObj() {
		return sortObj;
	}

	public void setSortObj(Sort sortObj) {
		this.sortObj = sortObj;
	}

	public int[] sort(int[] arr) {

		int[] newArr = sortObj.sort(arr);

		return newArr;
	}
}
