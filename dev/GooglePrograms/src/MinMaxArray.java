import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*public class IntegerComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		
		return -num1.compareTo(num2);
	}
	
}*/


public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int COUNT;
		
		//Take user input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Count:");
		COUNT = in.nextInt();
		Integer [] intArray = new Integer [COUNT];
		System.out.println("Enter the integers:");
		for(int i=0; i<COUNT;i++){
			intArray[i]=in.nextInt();
		}
		for(int i=0; i<COUNT;i++){
			System.out.println("The value at index " +i + "is " + intArray[i]);
		}
	
		Arrays.sort(intArray);
		
		System.out.println("After Sorting:");
		
		for(int i=0; i<COUNT;i++){
			System.out.println("The value at index " +i + " is " + intArray[i]);
		}
	
		System.out.println("Min value is : " +intArray[0]);
		System.out.println("Max value is : " +intArray[COUNT-1]);
		
		System.out.println("After Reverse Sorting:");

	
		
		Arrays.sort(intArray, Collections.reverseOrder());
		
		for(int i=0; i<COUNT;i++){
			System.out.println("The value at index " +i + " is " + intArray[i]);
		}
		
		//System.out.println(Arrays.binarySearch(intArray, COUNT-1));
	}





}


