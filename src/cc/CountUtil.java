package cc;

public class CountUtil {

	public static void count(Countable c, int maxCount){
		for (int i=1; i<=maxCount; i++){
			c.incrementCount();
			c.getCountString(i);
		}
		System.out.println();
	}
}
