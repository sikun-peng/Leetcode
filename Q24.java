public class Q24{
	
	/*
	public static RandomListNode copyRandomList(RandomListNode rn){
		Map<RandomListNode, RandomListNode> map = new HashMap<>();
		RandomListNode cur = rn;
		RandomListNode dummyHead = new RandomListNode(0);
		RandomListNode dcur = dummyHead;
		while(cur != null){
			dcur.next = new RandomListNode(cur.label);
			map.put(cur, dcur.next);
			cur = cur.next;
			dcur = dcur.next;
		}
		
		cur = rn;
		dcur = dummyHead;
		while(cur != null){
			dcur.next.random = map.get(cur.random);
			cur = cur.next;
			dcur = dcur.next;
		}
		
		return dummyHead.next;
	}
	*/
	
	
	public static RandomListNode copyRandomList(RandomListNode rn){
		RandomListNode cur = rn;
		while(cur != null){
			RandomListNode tempNext = cur.next;
			RandomListNode copy = new RandomListNode(cur.label);
			cur.next = copy;
			copy.next = tempNext;
			cur = tempNext;
		}
		cur = rn;
		whiloe( cur != null){
			cur.next.random = (cur.random != null)? cur.random.next: null;
			cur = cur.next.next;
			
		}
		cur = rn;
		RandomListNode headCopy = (cur != null)? cur.next: null ;
		while(cur != null){
			RandomListNode copy = cur.next;
			cur.next = copy.next;
			cur = cur.next;
			copy.next = ( cur != null)? cur.next: null;
		}
		
		return headCopy;
	}
}