package JavaPrograms1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1IO {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\MyAuto\\JavaPractice\\read.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			boolean fvar1 =file.exists();
			if(fvar1){
				System.out.println("File found!");
			}
			else{
				System.out.println("File not found!");
			}
			
			while(bis.available()>0){
				System.out.println((char)bis.read());
			}
		}
		catch(IOException e){
			System.out.println("I/O Exception: " +e);
			}
		
		finally{
		 fis.close();
		 bis.close();
		}
	}
}
