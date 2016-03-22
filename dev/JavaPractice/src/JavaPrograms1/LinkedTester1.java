package JavaPrograms1;

import java.util.ArrayList;

public class LinkedTester1 {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		obj.add(0, "name0");
		obj.add(1, "name1");
		obj.add(2,"name2");
		obj.add(3, "name3");
		obj.add(2,"name5");
		System.out.println(obj);
		//obj.remove(1);
		obj.set(4, "name5");
		System.out.println(obj);
		obj.set(2, "name2");
		System.out.println(obj);
		obj.set(3,"name3");
		obj.set(4,"name4");
		System.out.println(obj);
		if(obj.get(4).contains("name4")){
			System.out.println("hurray");
			obj.clear();
			
		}
		System.out.println(obj);
	}

}
