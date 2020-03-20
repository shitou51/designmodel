package designmodel.iterator;

public class SkyworthTelevision implements Television {

	@Override
	public TvIterator createIterator() {
		return new SkyworthIterator();
	}

	private class SkyworthIterator implements TvIterator {

		private Object[] obj = { "OOTV-1", "OOTV-2", "OOTV-3", "OOTV-4", "OOTV-5", "OOTV-6", "OOTV-7" };

		private int currentIndex = 0;

		@Override
		public void setChannel(int i) {
			currentIndex = i;

		}

		@Override
		public Object currentChannel() {
			return obj[currentIndex];
		}

		@Override
		public void next() {
			if (currentIndex < obj.length) {
				currentIndex++;
			}

		}

		@Override
		public void previous() {
			if (currentIndex > 0) {
				currentIndex--;
			}

		}

		@Override
		public boolean isLast() {

			return currentIndex == obj.length;
		}

		@Override
		public boolean isFirst() {
			return currentIndex == 0;
		}

	}

}
