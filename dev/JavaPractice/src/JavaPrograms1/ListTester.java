package JavaPrograms1;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListTester {

	public static void main(String[] args) {

		LinkedList<String> staff = new LinkedList<String>();
		LinkedList<Integer> id = new LinkedList<Integer>();
		staff.add("name1");
		staff.addFirst("name2");
		staff.addLast("name3");
		staff.add("name4");
		/*staff.addFirst("name5");
		staff.addLast("name6");*/
		
		ListIterator<String> Iterator = staff.listIterator();
		int count = 0;
		while (Iterator.hasNext()) {
			// System.out.println(Iterator.toString());

			String name = Iterator.next();
			System.out.println(name);
			count++;
		}
		System.out.println(staff);
		System.out.println("No of elements in the LinkedList: " + count);
		for (int i = 0; i <= count - 2; i++) {
			Iterator.previous();
		}
		String text = Iterator.previous();
		System.out.println(text);
		if (Iterator.next().equals("name5")) {

			Iterator.remove();
		}

		while (Iterator.hasNext()) {
			// System.out.println(Iterator.toString());

			String name = Iterator.next();
			System.out.println(name);
			count++;
		}

		System.out.println(staff);
	}
}
