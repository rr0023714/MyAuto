package JavaPrograms1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr= null;
		
		try {
			br = new BufferedReader(new FileReader("C:\\MyAuto\\JavaPractice\\read.txt"));
		
		while(br.readLine()!="null"){
			System.out.println(br.readLine());
		} 
		
		}
			catch (IOException e) {
				
				e.printStackTrace();
			}
		
	}

}
