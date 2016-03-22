import java.util.Scanner;


public class ReverseNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number =in.nextInt();
		int reverse=0, remainder;
		while(number!=0){
			remainder= number % 10;
			reverse= reverse *10+remainder;
			number = number /10;
			
			
		}
		
 System.out.println(reverse);
	}

}
