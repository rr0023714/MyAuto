import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class CountWordsFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Use Scanner to read file line by line
		List<String> arrList = new ArrayList<String>();
		String [] arr;
		FileInputStream fis= new FileInputStream("coverletter.txt");
		Scanner file = new Scanner(fis);
		
		while(file.hasNextLine()){
			String str = file.next();
			// separate each words from line and add to arraylist
			arr=str.split("\\s+ ");
			
			Collections.addAll(arrList, arr);
			System.out.println(str);
		}
		System.out.println(arrList.size());
		System.out.println(arrList);
		
		
		
		
		/*for(String s: arrList){
			System.out.println(s);
		}*/
		
		
		
		
		// count the words in the arraylist
		
		
		

	}

}
