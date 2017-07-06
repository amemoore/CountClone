package cc;

public interface Countable {
	
	public abstract void incrementCount(); 		//all interface methods are public abstract - keywords not needed.
	public abstract void resetCount();
	public abstract int getCount();
	public abstract void getCountString(int i);
}
