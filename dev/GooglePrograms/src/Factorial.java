import java.util.Scanner;


public class Factorial {
	
	static int factorial(int k){
		
		if(k<=1){
			return 1;
		}
		else
			return  k*factorial(k-1);
		
	}

	public static void main(String[] args) {

		int numb;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		numb=in.nextInt();
		int fact=factorial(numb);
		System.out.println(fact);
		
		

	}

}
