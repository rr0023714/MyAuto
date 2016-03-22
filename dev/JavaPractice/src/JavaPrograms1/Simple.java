package JavaPrograms1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import JavaPrograms.*;

public class Simple extends A{

	public static void main(String[] args) {
		Simple obj = new Simple();
		obj.msg();
		
		File file = new File("./read.txt");
		if(file.exists()){
			System.out.println("Hurray file found : " +file.getName() + " at absolute path: " +file.getAbsolutePath());
			System.out.printf("File length is %d", file.length());
		}
		else{
			System.out.println("File not found!");
		}
		
		String name, gender;
		int age;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter name: ");
		try {
			name=br.readLine();
			System.out.println("Name is :" +name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*System.out.println("Age is : " +age);
		System.out.println("Gender is : " +gender);*/
	}

}
