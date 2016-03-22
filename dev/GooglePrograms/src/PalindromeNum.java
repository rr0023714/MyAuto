import java.util.Scanner;


public class PalindromeNum {
	
	public static void isPalindrome(int k){
		int originialNumber =k;
	int newNumber=0;
	int remainder=0;
	while(k!=0)
		{
			remainder = k%10;
			k= k/10;
			newNumber = remainder +newNumber*10;
		}
	System.out.println("Reversed number is :  " +newNumber );
	
	if(originialNumber == newNumber){
		System.out.println(" The new number  " +newNumber + " is a palindrome of the number  " + originialNumber );
	}
	else{
		System.out.println(" The new number  " +newNumber + " is not a palindrome of the number  " + originialNumber);
	}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = in.nextInt();
		
		isPalindrome(number);

	}

}