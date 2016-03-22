package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListExample {

	public static void main(String[] args) {
	
		ArrayList<String> ArrList = new ArrayList<String>();
		ArrList.add(0, "China");
		ArrList.add(1, "Japan");
		ArrList.add(2, "USA");
		ArrList.add(3,"Cannada");
		ArrList.add(4, "Russia");
		ArrList.add(5, "Ukraine");
		System.out.println("Original list");
		
		System.out.println(ArrList);
		System.out.println("------------");
		System.out.println("After Reverse");
		Collections.reverse(ArrList);
		System.out.println(ArrList);
		System.out.println("------------");
		System.out.println("After Sorting");
		Collections.sort(ArrList);
		System.out.println(ArrList);
		System.out.println("------------");
		
		
		
		ArrayList<String> ArrList1 = new ArrayList<String>();
		ArrList1.add(0, "China");
		ArrList1.add(1, "Germany");
		ArrList1.add(2, "USA");
		ArrList1.add(3,"Cannada");
		ArrList1.add(4, "Russia");
		ArrList1.add(5, "India");
		
		System.out.println(ArrList1);
		System.out.println("------------");
		
		ArrayList<String> CombinedArr = new ArrayList<String>();
		CombinedArr.addAll(ArrList);
		CombinedArr.addAll(ArrList1);
		Collections.sort(CombinedArr);
		System.out.println("Combined Array is:");
		System.out.println(CombinedArr);
		System.out.println("------------");
		System.out.println("Compare two arraylist");
		ArrayList<String> al3= new ArrayList<String>();
		for(String temp: ArrList)
			al3.add(ArrList1.contains(temp)? "Yes" :"No");
			System.out.println(al3);
		
		Set<String> set1 = new TreeSet<String>(CombinedArr);
		System.out.println(set1);
		
		
	}

}
