package cc;

public class CountTestApp {
	
	public static Alligator alligator;
	public static Sheep sheep;

	public static void main(String[] args) {
		System.out.println("Welcome to the Count and Clone Application\n");
		
		System.out.println("Counting Alligators......\n");
			alligator = new Alligator();
			CountUtil.count(alligator, 3);
			
		System.out.println("Counting Sheep......\n");	
			sheep = new Sheep();
			sheep.setName("Blackie");
			CountUtil.count(sheep, 2);
			
			Sheep sheepClone = null;
			try {
				sheepClone = (Sheep) sheep.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			sheepClone.setName("Dolly");
			CountUtil.count(sheepClone, 3);
				
			CountUtil.count(sheep, 1);
	}
}
