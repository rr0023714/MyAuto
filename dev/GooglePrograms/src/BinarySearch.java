import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter count: " );
		final int COUNT=in.nextInt();
		int value;
		int [] intArr = new int[COUNT];
		System.out.println("Enter the integers: " );
		for(int i=0;i<COUNT;i++){
			intArr[i]=in.nextInt();
		}
		System.out.println("Search value is: " );
		value = in.nextInt();
		
		
		
		//System.out.println(Array[700]);
		Arrays.sort(intArr);
		System.out.println(intArr);
		//System.out.println(Array[700]);
		int startIndex=0;
		int endIndex=COUNT-1, median;
		median = startIndex + endIndex/2;
		System.out.println("Middle is: "+median);
		
		while(startIndex<=endIndex)
		{
			if(intArr[median]==value)
			{
				System.out.println("Value is found at index: " +median);
				break;
			}
			else if(intArr[median]<value)
			{
				startIndex=median+1;
				median = (startIndex + endIndex)/2;
				System.out.println(" Start now is: " +startIndex+ " Middle now is: " +median +  " End now is: " +endIndex); 
				
					}
			else 
			{	endIndex= median-1;
				median = (startIndex + endIndex)/2;
				System.out.println("Start now is: " +startIndex + " End now is: " +endIndex + " middle now is: " +median); 
				
			}
				
		}
		
		 if ( startIndex > endIndex )
		      System.out.println(value + " is not present in the list.\n");
	}
	
	
}
