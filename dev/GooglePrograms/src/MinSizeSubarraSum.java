
public class MinSizeSubarraSum {

	public static int minSubArrayLen(int[]nums, int s){
		
		
		// Condition 1 : if the array length = 0
		if(nums == null || nums.length==0){
			return 0;
		}
		
	
		
		int i=0;
		int sum = nums[0];
		// initialize minimum length to be the input array length
		int result = nums.length;
		
		for(int j=0;j<nums.length;){
		
		//Single element is large enough
			
			if(i==j){
				if(nums[i]>=s){
					return 1;
				}
				else{
					j++;
					
					if(j<nums.length){
						sum = sum + nums[j];
					}
					else{
						return result;
					}
				}
					
			}
		
		// if sum is large enough move cursor to left
			else{
				if(sum>=s){
					result=Math.min(j-i+1, result);
					sum=sum-nums[i];
					i++;
				}
		
		// if sum is not large enough move cursor to right	
			else{
				j++;
				if(j<nums.length){
					sum = sum + nums[j];
				}
				else{
					if( i==0){
						return 0;
						}
					else{
						return result;
						}
					}
				}
				
				
			}
			
		
		
		
			
		} //for loop closed
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]={2,3,1,2,4,3};
		int a[]={-1,-2,10};
		//int a[]={2,3,1,2,4,3,7,6,1};
		int s =7;
		int ans;
		ans =minSubArrayLen(a, s);
		
	}

}
