package collection;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20.6);
		l1.add("Hi");
		l1.add(true);
		l1.add(10);
		l1.add('a');
		l1.add(null);
		l1.add(10);
		System.out.println(l1.poll());
	
		System.out.println(l1.poll());
		
		System.out.println(l1.peek());
		
		System.out.println(l1.peek()); 
	}
}
