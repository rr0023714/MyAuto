package DataStructures;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Item1");
		list.add("Item2");
		list.add("Item3");
		list.add("Item4");
		list.add("Item5");
		list.addFirst("First Item");
		list.addLast("Last Item");
		System.out.println("list: " +list);
		
		/*list.removeLast();
		System.out.println("After remove");
		System.out.println("list: " +list);*/
		
		list.remove(4);
		System.out.println("After remove");
		System.out.println("list: " +list);
		
		
		Object o = list.get(3);
		System.out.println("The third element is : " +o);
		list.set(3, "changed value");
		System.out.println("The third element is : " +o);
	}  

}
