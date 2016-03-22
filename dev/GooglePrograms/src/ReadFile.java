import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;


public class ReadFile {

	
	
	public static void main(String[] args) {
		
		String content;
		
		File file = new File("coverletter.txt");
		
		try {
			FileReader fr=new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while((content=br.readLine())!=null)
			System.out.println(content);
			String patternString = " ";
			Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
			String [] arr1 =pattern.split(content);
			System.out.println(arr1.length);
			} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
		
	
		
		try {
			
			String mycontent="This string will be written " + "to the specified file";
			
			
			FileWriter fw=new FileWriter("my.txt", true);
			BufferedWriter bw= new BufferedWriter(fw);
			bw.write(mycontent);
			bw.newLine();
			bw.write("Let's party");
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
