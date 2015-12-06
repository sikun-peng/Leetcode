class Q29{
	public static TreeNode sortedArrayToBST(int[] array){
		
	}
	
	private static TreeNode sortedArrayToBST(int[] arr, int start, int end){
		if(start > end){
			return null;
		}
		int mid = (start + end)/2;
		TreeNode root = new TreeNode(arr[mid]);
		root.left = sortedArrayToBST(arr, start, mid-1 );
		root.right = sortedArrayToBST(arr, mid + 1, end);
		return root;
	}
	
}