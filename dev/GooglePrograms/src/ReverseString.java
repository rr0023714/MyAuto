import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		String user;
		String reverse = "";
//Take user input
		Scanner in = new Scanner(System.in);
		user = in.next();
		System.out.println(user);
		
		
//get the length of the string		
		
		int count = user.length();

		for (int i = count - 1; i >= 0; i--) 
		{
			reverse = ""+ user.charAt(i);
		
		}
		System.out.println(reverse);

	}

}
