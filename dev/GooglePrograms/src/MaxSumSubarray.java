import java.lang.*;

public class MaxSumSubarray {
	
	public static int maxsize(int arr[])
	{
		
		int sum=0;
		int ans = Integer.MIN_VALUE;
		//
		for(int i=0;i<arr.length;i++)
		{
			// computing sum after adding each element
			sum = sum + arr[i];
			
			// compare sum with answer
			if(sum>ans){
				ans=sum;
			}
			else if (sum>0){
				sum=sum;
			}
			else{
				sum=0;
			}
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
	 
		int arr1[]={1,-3,2,-5,7,6,-1,-4,11,-23};
		int arr2[]={-2,-3,-6,-12,-1,-52};
		int arr3[]={1,-3,2,-5,7,6,-1,-4,11,-23,73,-25};
		int max =maxsize(arr3);
		System.out.println(max);
	}

}
