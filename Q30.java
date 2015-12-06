class Q30{
	//convert sortedList to Balanced binary tree
	private ListNode list;
	
	private static TreeNode sortedListToBST(int start, int end){
		if(start > end){
			return null;
		}
		int mid  = (start + end)/2;
		TreeNode leftNode = sortedListToBST(start, mid - 1);
		TreeNode parent = new TreeNode(list.val);
		parent.left = leftNode;
		list = list.next;
		parent.right = sortedListToBST(mid+1, end);
		return parent
	}
	public static TreeNode sortedListToBST(ListNode head){
		int n = 0;
		ListNode cur = head;
		while( cur!= null){
			cur = cur.next;
			n++;
		}
		list = head; 
		//find size;
		return sortedListToBST(0 , n-1);
	}
}