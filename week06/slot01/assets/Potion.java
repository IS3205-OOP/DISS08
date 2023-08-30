package week06.slot01.assets;

import week06.slot01.assets.interfaces.Consumable;
import week06.slot01.assets.interfaces.Placeable;

public class Potion implements Placeable, Consumable {

	private int heal;
	
	public Potion(int heal) {
		if(heal <= 0) {
			heal = 1;
		}
		this.heal = heal;
	}
	
	public int getHeal() {
		return heal;
	}
	
	public String toString() {
		return "Potion [heal=" + heal + "]";
	}

	@Override
	public int doHealing(Pirate pirate) {
		if(pirate != null) {
			int newHealth = pirate.getHealth() + heal;
			return newHealth;
		}
		return -1;
	}
	
}
