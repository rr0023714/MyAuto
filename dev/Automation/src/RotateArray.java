
public class RotateArray {
	
   public static void rotate(int arr[], int k){
	   
	   int result[] = new int[arr.length];
		for(int i=0;i<k;i++){
			 result[i]= arr[arr.length-k+i];
		}
		
		for(int i=k;i<=arr.length-1;i++){
			result[i]=arr[i-k];
		}
		
		for(int i=0; i<arr.length;i++){
			System.out.printf("%d" , result[i]);
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] ={1,2,3,4,5,6,7};
		int k =4;
		rotate(arr, k);

	}

}
