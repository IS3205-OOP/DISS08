package week02.slot02.app;

import week02.slot02.assets.Pirate;

public class TestApp {

	public static void main(String[] args) {
		Pirate pirate1 = new Pirate("Abu", 5);
		Pirate pirate2 = new Pirate(null, -10);
		Pirate pirate3 = new Pirate("", 10);

		System.out.println(pirate1.toString());
		System.out.println(pirate2);
		System.out.println(pirate3);
	}
	
}
