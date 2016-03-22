import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexTutorial {
	
	public static void regexChecker(String strFind, String strCheck){
		Pattern p = Pattern.compile(strFind);
		Matcher m = p.matcher(strCheck);
		while(m.find()){
			if((m.group().length())!=0){
				System.out.println(m.group().trim());
				String text = m.group().trim();
				writeToFile("myNumbers",text);
			}
			System.out.println("Start Index:  "+m.start());
			System.out.println("Start Index:  "+m.end());
		}
	}

public static void writeToFile(String strFileName, String strLine){
		
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFileName, true)))){
			out.println(strLine);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public static void readFromFile(String strFileName, String strPattern){
	
	try{
		FileInputStream fis = new FileInputStream(strFileName);
		Scanner scan = new Scanner(fis);
		while(scan.hasNextLine()){
			String str= scan.nextLine();
			regexChecker(strPattern,str);
		
			
		}
	} catch (Exception e) {
			e.printStackTrace();}
	}
	
	public static void main(String[] args) {
		readFromFile("coverletter.txt","\\d{10}");
		
	}
   
		
}