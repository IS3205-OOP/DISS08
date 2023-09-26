package week09.slot02;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LearningMaps {

	public static void main(String[] args) {
		// HashMap, LinkedHashMap, TreeMap
//		HashMap<String, String> students = new HashMap<String, String>();
//		LinkedHashMap<String, String> students = new LinkedHashMap<String, String>();
		TreeMap<String, String> students = new TreeMap<String, String>();
		
		students.put("30FTT1234", "Abu");
		students.put("21FTT1123", "Bakar");
		students.put("61FTT5521", "Daging");
		students.put("21FTT1782", "Curi");
		System.out.println(students);
		
		if(students.containsKey("21FTT1782") == false) {			
			students.put("21FTT1782", "Emak");
		}
		System.out.println(students);
		
		if(students.containsKey("77FTT9876") == false) {			
			students.put("77FTT9876", "Fatimah");
		}
		System.out.println(students);
		
		System.out.println(students.get("77FTT9876"));
		
		students.remove("21FTT1782");
		System.out.println(students);
		
		students.remove("61FTT5521", "Geli");
		System.out.println(students);
		
		students.replace("61FTT5521", "Hati");
		System.out.println(students);
		
		students.replace("30FTT1234", "Ikut", "Jalan");
		System.out.println(students);
		
		System.out.println(students.keySet());
		System.out.println(students.values());
	}
	
}
