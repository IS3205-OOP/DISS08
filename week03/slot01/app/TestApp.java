package week03.slot01.app;

import week03.slot01.assets.Map;
import week03.slot01.assets.Pirate;

public class TestApp {

	public static void main(String[] args) {
		Map map = new Map(-5, 5);
//		map.arena[3][3] = new Pirate("Abu", 4);
		
		Map anotherMap = new Map(7, 3);
		
		printArena(map);
		
		printArena(anotherMap);
		
//		anotherMap.arena[2][0] = new Pirate("Bakar", 2);
		
		printArena(anotherMap);
		
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
