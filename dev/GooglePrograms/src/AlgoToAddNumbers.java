
public class AlgoToAddNumbers {

	public static void main(String[] args) {
		Solution s= new Solution();
		ListNode l1 = new ListNode(7);
		ListNode l2 = new ListNode(4);
		System.out.println(s.addToNumbers(l1, l2));
		l1.next=new ListNode(5);
		l1.next=new ListNode(3);
		System.out.println(s.addToNumbers(l1, l2));
		l2.next=new ListNode(6);
		l2.next=new ListNode(3);
		System.out.println(s.addToNumbers(l1, l2));
		
		
		System.out.println(s.addToNumbers(l1, l2));

	}

}


