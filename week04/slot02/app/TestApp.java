package week04.slot02.app;

import week04.slot02.assets.Map;
import week04.slot02.assets.Pirate;
import week04.slot02.assets.weapons.Axe;
import week04.slot02.assets.weapons.Drumstick;
import week04.slot02.assets.weapons.Gun;
import week04.slot02.assets.weapons.Sword;
import week04.slot02.assets.weapons.Weapon;

public class TestApp {

	public static void main(String[] args) {
		Map map = new Map(5, 5);
		Pirate pirate1 = new Pirate();
		Pirate pirate2 = new Pirate("Abu", 3);
		Pirate pirate3 = new Pirate("Bakar", 6, 2);
		map.addPirate(2, 4, pirate1);
		map.addPirate(1, 1, pirate2);
		map.addPirate(0, 1, pirate3);
		printArena(map);
		
		Drumstick weapon1 = new Drumstick(1);
		map.selectPirate(1, 1).equipWeapon(weapon1);
		printArena(map);
		
		map.movePirateLeft(1, 1);
		printArena(map);
		
		Sword weapon2 = new Sword(3);
		map.selectPirate(0, 1).equipWeapon(weapon2);
		map.movePirateRight(0, 1);
		printArena(map);
	}
	
	public static void printArena(Map map) {
		for(int y = 0; y < map.getHeight(); y++) {
			for (int x = 0; x < map.getWidth(); x++) {
				System.out.print(map.selectPirate(x, y) + "\t");
			}
			System.out.println();
		}
		System.out.println("****************");
	}
	
}
