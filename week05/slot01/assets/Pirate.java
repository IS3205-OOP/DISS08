package week05.slot01.assets;

import week05.slot01.assets.interfaces.Placeable;
import week05.slot01.assets.weapons.Weapon;

public class Pirate implements Placeable {
	
	private final static int DEFAULT_HEALTH = 5;
	private final static String DEFAULT_NAME_PREFIX = "Pirate";
	private static int totalPirates = 1;
	private String name;
	private int health;
	private int defence;
	private Weapon weapon;
	
	public Pirate() {
		this(null, DEFAULT_HEALTH);
	}
	
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
	
	public Pirate(String name, int health, int defence) {
		this(name, health);
		if(defence < 0) {
			defence = 0;
		}
		this.defence = defence;
	}
	
	public String toString() {
		return "[" + name + ", " + health + "h, " 
					+ defence + "d, " + weapon + "]";
	}
	
	public void attackOtherPirate(Pirate otherPirate) {
		if(otherPirate != null) {
			if(weapon == null) {
				// Not holding weapon
				if(otherPirate.getDefence() <= 0) {					
					otherPirate.health--;
				}
			} else {
				// Holding weapon
				int damage = weapon.doDamage(otherPirate);
				if(damage > 0) {
					int newHealth = otherPirate.health - damage;
					otherPirate.health = newHealth;
				}
			}
		}
	}
	
	public void equipWeapon(Weapon weapon) {
		if(weapon != null) {			
			this.weapon = weapon;
		}
	}
	
	public int getHealth() {
		return health;
	}

	public int getDefence() {
		return defence;
	}
	
}
