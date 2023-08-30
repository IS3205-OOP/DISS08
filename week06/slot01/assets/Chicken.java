package week06.slot01.assets;

import week06.slot01.assets.interfaces.Consumable;
import week06.slot01.assets.interfaces.Placeable;

public class Chicken implements Placeable, Consumable {

	private boolean raw;
	
	public Chicken(boolean raw) {
		this.raw = raw;
	}

	@Override
	public int doHealing(Pirate pirate) {
		if(pirate != null) {			
			if(raw) {
				int newHealth = pirate.getHealth() - 1;
				return newHealth;
			} else {
				int newHealth = pirate.getHealth() + 2;
				return newHealth;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return "Chicken [raw=" + raw + "]";
	}
	
}
