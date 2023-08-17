package week03.slot02.app;

import week03.slot02.assets.Map;
import week03.slot02.assets.Pirate;

public class TestApp {

	public static void main(String[] args) {
		Map map = new Map(5, 5);
		Pirate pirate1 = new Pirate();
		Pirate pirate2 = new Pirate("Abu", 3);
		map.addPirate(2, 4, pirate1);
		map.addPirate(1, 1, pirate2);
		
		printArena(map);
		
		map.movePirate(1, 1, 3, 2);
		
		printArena(map);
		
		map.movePirate(3, 2, 2, 4);
		
		printArena(map);
		
		map.movePirate(3, 2, Map.DIRECTION_UP);
		
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
