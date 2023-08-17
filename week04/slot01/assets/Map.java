package week04.slot01.assets;

public class Map {

	public final static String DIRECTION_UP = "up";
	public final static String DIRECTION_DOWN = "down";
	public final static String DIRECTION_LEFT = "left";
	public final static String DIRECTION_RIGHT = "right";
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
		if(checkCoordinate(x, y)) {			
			return arena[x][y];
		}
		return null;
	}
	
	public void addPirate(int x, int y, Pirate newPirate) {
		if(checkCoordinate(x, y)) {			
			arena[x][y] = newPirate;
		}
	}
	
	public boolean checkCoordinate(int x, int y) {
		if(x >= 0 && x < getWidth() && y >= 0 && y < getHeight()) {			
			return true;
		}
		return false;
	}
	
	public void movePirateUp(int currentX, int currentY) {
		movePirate(currentX, currentY, DIRECTION_UP);
	}
	
	public void movePirateDown(int currentX, int currentY) {
		movePirate(currentX, currentY, DIRECTION_DOWN);
	}
	
	public void movePirateLeft(int currentX, int currentY) {
		movePirate(currentX, currentY, DIRECTION_LEFT);
	}
	
	public void movePirateRight(int currentX, int currentY) {
		movePirate(currentX, currentY, DIRECTION_RIGHT);
	}
	
	public void movePirate(int currentX, int currentY, String direction) {
		if(direction.equalsIgnoreCase(DIRECTION_UP)) {
			movePirate(currentX, currentY, currentX, currentY - 1);
		} else if(direction.equalsIgnoreCase(DIRECTION_DOWN)) {
			movePirate(currentX, currentY, currentX, currentY + 1);
		} else if(direction.equalsIgnoreCase(DIRECTION_LEFT)) {
			movePirate(currentX, currentY, currentX - 1, currentY);
		} else if(direction.equalsIgnoreCase(DIRECTION_RIGHT)) {
			movePirate(currentX, currentY, currentX + 1, currentY);
		}
	}
	
	public void movePirate(int currentX, int currentY, int newX, int newY) {
		Pirate pirate = selectPirate(currentX, currentY);
		if(pirate != null) {
			if(checkCoordinate(newX, newY)) {
				Pirate otherPirate = selectPirate(newX, newY);
				if(otherPirate == null) {
					// Move the pirate to the new location
					arena[newX][newY] = pirate;
					arena[currentX][currentY] = null;
				} else {
					// Attack the other pirate
					pirate.attackOtherPirate(otherPirate);
					if(otherPirate.getHealth() <= 0) {
						arena[newX][newY] = pirate;
						arena[currentX][currentY] = null;
					}
				}
			}
		}
	}
	
}






