import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;


public class ListIteratorExample {

	public static void main(String[] args) {
		
		HashSet<String> names = new HashSet<String>();
		names.add("Rakesh");
		names.add("Asha");
		names.add("Shiv");
		
		ArrayList<String> p = new ArrayList<String>();
		p.add(0, "Achan");
		p.add(1, "Amma");
		p.add(2, "Umesh");
		p.add(3, "Dinesh");
		p.add(4, "Dad");
		p.add(5, "Mom");
		p.add(6, "Archana");
		
		//names.addAll(p);
		p.addAll(names);
		
		ListIterator<String> li = null;
		li=p.listIterator();
		//li=(ListIterator<String>) names.iterator();
		
		while(li.hasNext()){
		System.out.println(li.next());	
		}
		
		p.get(5);
		System.out.println(p.get(5));
		
	
			System.out.println("index of mom is : " +p.indexOf("mom"));
			
		

	}

}
