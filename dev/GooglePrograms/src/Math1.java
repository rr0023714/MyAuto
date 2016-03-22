import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Math1 {

	public static void main(String[] args) {
/*
		int max = Math.max(1, 5);
		int m = Math.addExact(5, 10);
		int m1 = Math.multiplyExact(567, 789);
		int m2 = Math.floorDiv(m1, m);
		System.out.println(m2);*/
		
		String txt = "I am devoted to lord Shiva";
		char c []= txt.toCharArray();
		/*String	reverseStr ="";
		
	
		
		for( int i = c.length-1;i>=0;i--)
		{
			reverseStr  = reverseStr + txt.charAt(i);
		}
		
		System.out.println(reverseStr);
		*/
		Map<Character, Integer>map= new HashMap<Character, Integer>();
		Set<Character> key= map.keySet();
		for(char c1 : c){
			if(map.containsKey(c1))
				map.put(c1, map.get(c1)+1);
			else
				map.put(c1, 1);
		}
		
		
	}

}
