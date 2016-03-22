import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ReplaceStringInFile {

	public static void main(String[] args) {
		
		try{
		File file = new File("coverletter.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
		String str=br.readLine();
		String totalStr = "";
		while(str!=null){
			//String str1 = br.readLine();
			//String str1 = str;
			// write code for pattern match
			String patternStr=".*rakesh.*";
			Pattern pattern = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(str);
			//boolean isMatch = matcher.matches();
			System.out.println("wait");			
			// write code to replace the match
			/*if(isMatch){
				System.out.println("Pattern  " +patternStr  +" has a match in String  " );
				
				str = br.readLine();
			}*/
			while(matcher.find()){
				System.out.println("Pattern  " +patternStr  +" has a match in String  " );
				totalStr += str;
				totalStr=totalStr.replaceAll("Rakesh", "Asha");
				FileWriter fw=new FileWriter("coverletter.txt");
				fw.write(totalStr);
				fw.close();
			}
			 
			str = br.readLine();
		}
		
		}
		
		catch(IOException e){
			System.out.println("Error related to file");
		}

	}
	

}
