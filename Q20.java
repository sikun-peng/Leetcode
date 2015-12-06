import java.util.*;


class Q20{
	public ListNode merge(ListNode n1, ListNode n2){
		ListNode head = new ListNode(0);
		ListNode current = head;
		while(n1 != null && n2!= null){
			if(n1.val >= n2.val){
				current.next = n1;
				n1 = n1.next;
			}
			else{
				current.next = n2;
				n2 = n2.next;
			}
			current = current.next;
		}
		if(n1 != null){
			current.next = n1;
		}
		if(n2 != null){
			current.next = n2;
		}
		return head.next;
	}

	public static void main(String[] args){
		
		
	}
}