package week09.slot01;

import java.util.LinkedList;
import java.util.Queue;

public class LearningQueue {

	public static void main(String[] args) {
		Queue<String> customers = new LinkedList<String>();
		
		customers.add("Abu");
		customers.add("Bakar");
		customers.add("Curi");
		customers.add("Daging");
		System.out.println(customers);
		
		System.out.println(customers.peek());
		System.out.println(customers);
		
		System.out.println(customers.poll());
		System.out.println(customers);
	}
	
}
