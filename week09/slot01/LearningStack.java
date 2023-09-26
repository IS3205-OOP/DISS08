package week09.slot01;

import java.util.Stack;

public class LearningStack {

	public static void main(String[] args) {
		Stack<String> bookList = new Stack<String>();
		
		bookList.add("Java");
		bookList.add("PHP");
		bookList.add("Python");
		System.out.println(bookList);
		
		System.out.println(bookList.peek());
		System.out.println(bookList);
		
		System.out.println(bookList.pop());
		System.out.println(bookList);
		
		while(bookList.isEmpty() == false) {
			System.out.println(bookList.pop());
		}
		System.out.println(bookList);
	}
	
}
