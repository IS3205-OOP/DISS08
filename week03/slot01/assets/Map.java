package week03.slot01.assets;

public class Map {

	private Pirate[][] arena;
	
	public Map(int width, int height) {
		if(width <= 0) {
			width = 5;
		}
		if(height <= 0) {
			height = 5;
		}
		arena = new Pirate[width][height];
	}
	
	public int getWidth() {
		return arena.length;
	}
	
	public int getHeight() {
		return arena[0].length;
	}
	
	public Pirate selectPirate(int x, int y) {
		if(x >= 0 && x < getWidth() && y >= 0 && y < getHeight()) {			
			return arena[x][y];
		}
		return null;
	}
	
}
