package JavaPrograms1;

import java.io.*;

public class BinaryReadWrite {
	


	static byte b [];
	
	public static void main(String [] args){
		String filepath1= "./Hydrangeas.jpg";
		read(filepath1);
		String filepath2="./Hydrangeas2.jpg";
		write(filepath2);
		
		
	}
	
	
	public static void read(String filepath){
		try {
			File f = new File(filepath);
			FileInputStream fis = new FileInputStream(f);
			long length =f.length();
			System.out.println(length);
			b= new byte[(int)length];
			//System.out.println(b);
			fis.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		 System.err.println(e);
		}
		
	}
	public static void write(String filepath){
		File f = new File(filepath);
		try {
			FileOutputStream fos = new FileOutputStream(f);
			
			fos.write(b);
		} catch (IOException e) {
			System.err.println(e);
		}
		
		
	}

}
