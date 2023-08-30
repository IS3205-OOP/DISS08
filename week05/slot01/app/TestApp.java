package week05.slot01.app;

import week05.slot01.assets.Map;
import week05.slot01.assets.Pirate;
import week05.slot01.assets.Potion;
import week05.slot01.assets.weapons.Axe;
import week05.slot01.assets.weapons.Drumstick;
import week05.slot01.assets.weapons.Gun;
import week05.slot01.assets.weapons.Sword;
import week05.slot01.assets.weapons.Weapon;

public class TestApp {

	public static void main(String[] args) {
		Map map = new Map(5, 5);
		Pirate pirate1 = new Pirate();
		Pirate pirate2 = new Pirate("Abu", 3);
		Pirate pirate3 = new Pirate("Bakar", 6, 2);
		map.addPirate(2, 1, pirate1);
		map.addPirate(3, 2, pirate2);
		map.addPirate(3, 3, pirate3);
		map.addAssets(3, 1, new Axe(3));
		map.addAssets(4, 3, new Gun(2, 1));
		map.addAssets(2, 3, new Drumstick(2));
		map.addAssets(1, 2, new Potion(4));
		printArena(map);
		
		map.movePirateRight(2, 1);
		printArena(map);
		
		map.movePirateDown(3, 1);
		printArena(map);
	}
	
	public static void printArena(Map map) {
		for(int y = 0; y < map.getHeight(); y++) {
			for (int x = 0; x < map.getWidth(); x++) {
				System.out.print(map.selectAsset(x, y) + "\t");
			}
			System.out.println();
		}
		System.out.println("****************");
	}
	
}
