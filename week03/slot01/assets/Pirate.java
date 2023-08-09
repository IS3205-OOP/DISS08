package week03.slot01.assets;

public class Pirate {
	
	private final static int DEFAULT_HEALTH = 5;
	private final static String DEFAULT_NAME_PREFIX = "Pirate";
	private static int totalPirates = 1;
	private String name;
	private int health;
	
	public Pirate(String name, int health) {
		if(name == null || name.equals("")) {
			this.name = DEFAULT_NAME_PREFIX + totalPirates;
			totalPirates++;
		} else {			
			this.name = name;
		}
		if(health < 1) {
			this.health = DEFAULT_HEALTH;
		} else {
			this.health = health;			
		}
	}
	
	public String toString() {
		return "[" + name + ", " + health + "]";
	}
	
}
