import java.util.Arrays;


public class MaxProductSubArray {

	
	public static int[] getMaxSubArray(int []arr){

	    int maxEndingHere = arr[0], maxSoFar = arr[0], startIndex =0, start =0,end=0;

	    for(int i=1;i<arr.length;i++){

	        if(maxEndingHere<=0){
	            maxEndingHere = arr[i];
	            startIndex = i;         
	        }else{          
	            maxEndingHere *= arr[i];
	        }           
	        if(maxEndingHere>=maxSoFar){
	            maxSoFar = maxEndingHere;
	            start = startIndex;
	            end = i;
	        }   
	    }       
	    if(start<=end)
	        return Arrays.copyOfRange(arr, start, end+1);

	    return null;
	}
	
	public static void main(String[] args) {
		int arr1 []={-7,-5,-9,-1,25,0,1,2,3,4,5,-1};
		int [] arr2 =getMaxSubArray(arr1);
		for(int i=0;i<arr2.length;i++){
			System.out.printf("%d" ,arr2[i]);
		}
		

	}

}
