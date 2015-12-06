class Q22{
	public static ListNode swapPairs(ListNode node){
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = node;
		ListNode prev = dumyHead;
		ListNode cur = node;
		
		while( cur != null){
			ListNode temp1 = cur.next;
			ListNode temp2 = cur.next.next;
			
			prev.next = temp1;
			temp1.next = cur;
			cur.next = temp2;
			
			prev = cur;
			cur = temp2;			
		}
		
		return dummyHead.next;
		
	}
	
}