package week06.slot01.app;

import week06.slot01.assets.Pirate;
import week06.slot01.assets.interfaces.Placeable;

public class Antah {

	public static void main(String[] args) {
		Placeable[][] arena = new Placeable[5][5];
		
		arena[4][4] = new Pirate();
		
		Pirate x = (Pirate) arena[4][4];
	}
	
}
