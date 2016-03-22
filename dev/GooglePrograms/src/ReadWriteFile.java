import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadWriteFile {
	
	public static void readFromFile(String strFileName, String strPattern, String strReplace){
		
		try{
			//FileInputStream fis = new FileInputStream(strFileName);
			File file = new File(strFileName);
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()){
				String str= scan.nextLine();
				Pattern p = Pattern.compile(strPattern);
				Matcher m = p.matcher(str);
				if(m.find()){
					//code to replace the string
					
					str= str.replaceAll(strPattern, strReplace);
					System.out.println("Match found in " +str);
					writeToFile("BinaryTree1.docx",str);
				}
				
				writeToFile("BinaryTree1.txt",str);
				//code to write the string to new file...call writeToFile
				//writeToFile("newFile",str);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	
	public static void main(String [] args){
		
		readFromFile("BinaryTree.txt","\\d{3}", "");
		
	}

}
