import java.util.Scanner;


public class BubbleSort {
	
	//Print the array
	
	public static void printArray(int [] numbers ){
		
		int len = numbers.length;
		System.out.println();
		System.out.println("Array is:  ");
		for(int i=0;i<len;i++){
			System.out.print( numbers[i] + " ");
		}
	}
	// Bubble Sort alogorithm	
	public static int[] bubbleSortedArray(int [] numbers)
	{
		int tempArr[] = numbers;
		int temp;
		int count =10;
		for(int i=0;i<=count-1;i++)
		{
			for(int j=0;j<count-1;j++)
			{
				if(tempArr[j]>tempArr[j+1])
				{
					temp=tempArr[j];
					tempArr[j]=tempArr[j+1];
					tempArr[j+1]=temp;
				}
			}
		}
		return tempArr;
	}
	
	public static int[] selectionSortedArray(int [] numbers)
	{
		int tempArr[] = numbers;
		int temp;
	//	int count =10;
		int index = 0;
		
		// find minimum item from the array
		
		for(int j=0;j<tempArr.length-4;j++)
		{
			int minValue= tempArr[j];
				for(int i=j+1; i<tempArr.length;i++)
				{
					if(tempArr[i]<minValue){
						minValue=tempArr[i];
						 index=i;
					} 
				} //i-loop
				tempArr[index]=tempArr[j];
				tempArr[j]=minValue;
				
				
				
		}//j-loop
		
		
		return tempArr;
		
	}
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int myArray[] = new int[10];
			
			//Accept the user input
			for(int i=0;i<10;i++){
				myArray[i]=in.nextInt();
			}
			
		printArray(myArray);
		
		//int finalArray[]= bubbleSortedArray(myArray);
		int finalArray[]= selectionSortedArray(myArray);
		
		printArray(finalArray);
		
		
	}

}
