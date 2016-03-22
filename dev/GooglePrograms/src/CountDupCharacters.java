
import java.util.Map;
import java.util.HashMap;

public class CountDupCharacters {
	
	void CountDup(String str){
		char chars[] = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		//Set<Character> keys= map.keySet();
		
		for(Character ch : chars){
			if(map.containsKey(ch))
				{
					map.put(ch, map.get(ch)+1);
				}
			else map.put(ch,1);
				}
		
		for(Character ch: chars){
			if(map.get(ch)>1){
				System.out.println("Duplicate char:  "+ch + " repeated : "+map.get(ch));
			}
		}
		}
		
	

	public static void main(String[] args) {
		
		CountDupCharacters obj = new CountDupCharacters();
		obj.CountDup("HAPPY NEW YEAR");
		

	}

}
