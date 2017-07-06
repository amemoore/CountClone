package cc;

public class Alligator implements Countable {
	
	private int count;

	@Override
	public void incrementCount() {
		count++;
	}

	@Override
	public void resetCount() {
		count = 0;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void getCountString(int i) {
		System.out.println(i + " alligator");
	}
}
