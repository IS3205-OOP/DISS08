package week09.slot01;

import java.util.ArrayList;

public class LearningArrayList {

	public static void main(String[] args) {
		ArrayList<String> countryList = new ArrayList<String>();
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		System.out.println(countryList.isEmpty());
		System.out.println(countryList.size());
		System.out.println(countryList);
		
		countryList.add("Brunei");
		countryList.add("Malaysia");
		countryList.add("Indonesia");
		
		System.out.println(countryList.isEmpty());
		System.out.println(countryList.size());
		System.out.println(countryList);
		
		countryList.add(0, "Singapore");
		System.out.println(countryList);
		
		countryList.add(2, "Timor Leste");
		System.out.println(countryList);
		
		System.out.println(countryList.get(3));
		
		countryList.add(countryList.size(), "Thailand");
		System.out.println(countryList);
		
		countryList.remove(0);
		System.out.println(countryList);
		
		countryList.set(1, "Vietnam");
		System.out.println(countryList);
	}
	
}
