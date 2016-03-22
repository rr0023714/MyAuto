
public class Solution {
	
	public ListNode addToNumbers(ListNode l1 , ListNode l2){
		
		ListNode newHead = new ListNode(0);
		ListNode p3 = newHead;
		
		ListNode p1= l1;
		ListNode p2 = l2;
		
		boolean flag = false;
		int val;
		
		while(p1!= null || p2!= null){
			
			if(p1!=null && p2!=null){
				
				if(flag){
					val = p1.val+p2.val+1;
				}else{
					val=p1.val+p2.val;
				}
				
				if(val>=10){
					flag = true;
				}else{
					flag = false;
				}
				
				p3= new ListNode(val%10);
				p2=p2.next;
				p1=p1.next;
				
				
			}
			else if(p1!=null){
				
				if(flag){
					val = p1.val+1;
				}else{
					val=p1.val;
				}
				if(val>=10){
					flag = true;
				}else{
					flag = false;
				}
				
				p3= new ListNode(val%10);
				p1=p1.next;
				
			}
			else if(p2!=null){
				if(flag){
					val = p2.val+1;
				}else{
					val=p2.val;
				}
				
				if(val>=10){
					flag = true;
				}else{
					flag = false;
				}
				
				p3= new ListNode(val%10);
				p2=p2.next;
				
			}
			
			
			
			p3=p3.next;
		}
		// condition where p1 & p2 both are null while the flag is true
		if(p1 == null && p2 == null && flag){
			
			p3.next= new ListNode(1);
		}
		
		return newHead.next;
	}
}