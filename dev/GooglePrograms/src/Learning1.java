import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Learning1 {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("coverletter.txt");) {
			Scanner scan = new Scanner(fis);
			//String str=scan.next();
			String searchContent = "my";
			String str1=scan.nextLine();
			
			System.out.println(str1);
			int count=0;
			
			while(scan.hasNextLine()){
			Pattern p = Pattern.compile(searchContent,Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(str1);
			while(m.find()){
				count++;
				m.start();
				System.out.printf("found match for '%s' at index '%d' and '%d'" ,searchContent, m.start(), count);
				System.out.println();
			}
			str1=scan.nextLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}


	}

}
