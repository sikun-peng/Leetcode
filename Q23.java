class Q23{  


// solution Heap method

/*
	private static final Comparator<ListNode> listComparator =  new Comparator<ListNode>(){
		@Override
		public int compare(ListNode x, ListNode y){
			return x.value - y.value;
		}
	};
		
	public ListNode mergeKLists(List<ListNode> lists){
		if(list.isEmpty()){
			return null;
		}
		
		Queen<ListNode> queen = new PriorityQueue<>(lists.size(), listComparator);
		for(ListNode node: lists){
			if(node != null){
				queue.add(node);
			}
		}
		
		ListNode dummyHead = new ListNode(0);
		ListNode cur = dummyHead;
		while(!queue.isEmpty()){
			ListNode node = queue.poll();
			cur.next = node;
			cur = cur.next;
		}
	return dummyHead.next;
	}
*/


	public static ListNode mergeKList(List<ListNode> lists){
		ListNode dummyHead = new ListNode(0);
		if( lists.isEmpty()){
			return null;
		}
		int end = lists.size() -1;
		while( end > 0 ){
			int start = 0;
			while(begin < end){
				lists.set(begin, mergeTwoList(lists.get(begin), lists.get(end)));
				start++;
				end--;
			}
		} 
		
		return lists.get(0);
	}
}




