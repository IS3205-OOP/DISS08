package week05.slot01.assets.weapons;

import week05.slot01.assets.Pirate;
import week05.slot01.assets.interfaces.Placeable;

public abstract class Weapon implements Placeable {

	private int damage;
	
	public Weapon(int damage) {
		setDamage(damage);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		if(damage <= 0) {
			damage = 1;
		}
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "Weapon [damage=" + damage + "]";
	}
	
	public abstract int doDamage(Pirate pirate);
	
}
