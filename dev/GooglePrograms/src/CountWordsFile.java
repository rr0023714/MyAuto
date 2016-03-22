//Pattern Match for string
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CountWordsFile{
	
public static void main(String [] args) throws FileNotFoundException{
	
	FileInputStream fis = new FileInputStream("coverletter.txt");
	Scanner scan = new Scanner(fis);
	String str=scan.nextLine();
	System.out.println(str);
	int count=0;
	String contentSearch="my";
	
	while(scan.hasNextLine()){
		
	
	Pattern p = Pattern.compile(contentSearch, Pattern.CASE_INSENSITIVE);
	Matcher m = p.matcher(str);
	//boolean isBoolean
	while(m.find()){
		count++;
	}
	str= scan.nextLine();
	}
	System.out.printf("Number of occurences for '%s' is: %d " ,contentSearch, count);

}
}



