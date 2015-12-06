class Q21{
	public static ListNode addTwoNumbers(ListNode n1, ListNode n2){
		ListNode c1 = n1;
		ListNode c2 = n2;
		ListNode dummyHead = new ListNode(0);
		ListNode cur = dummyhead;
		cur = cur.next;
		int k = 0;
		
		while(c1!= null || c2 != null){			
			int x, y = 0, 0;
			
			if(c1 != null){
				x = c1.value;
				c1 = c1.next;
			}
			
			if(c2 != null){
				y = c2.value;
				c2 = c2.next;
			}
			
			int d = (x + y) %10;		
			cur.next = new ListNode(d + k);
			k = (x + y) /10;
			
		}
		
		if(k > 0){
			cur.next = new ListNode(k);
		}
		return dummyHead.next;
	}
	
	public static void main(String[] args){
		
		
	}
	
}