
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class CountWordsFile1 {

	public static void main(String[] args) {
		Map<String, Integer>wordList = new HashMap<String, Integer>();
		Set<String> keys = wordList.keySet();
		FileInputStream fis;
		try {
			fis = new FileInputStream("coverletter.txt");
			Scanner scan = new Scanner(fis);
			
			
			// Read file
			while(scan.hasNext()){
			String nextWord = scan.next();
			//Determine if this is an existing word; if existing increment the value by 1
			if(wordList.containsKey(nextWord)){
				//increment value 
				wordList.put(nextWord, wordList.get(nextWord)+1);
			}
			else{
				wordList.put(nextWord, 1);
			}
			
		}
			//System.out.println(wordList);
			for(String key: keys){
				Integer value= wordList.get(key);
				System.out.println(key +"-->" +value);
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
