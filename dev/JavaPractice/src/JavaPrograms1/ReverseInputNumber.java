package JavaPrograms1;

import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseInputNumber {

	public static void main(String[] args) {
		int temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your desired number: ");
	while(in.hasNextInt()){
		temp =in.nextInt();
		System.out.println(temp);
		
	}
	}

}
