package cc;

public class Sheep implements Countable, Cloneable {

	private int count;
	private String name;
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
		System.out.println(i + " " + name);
	}
}
