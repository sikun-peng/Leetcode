class Q26{
	
	public static int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
	}
	
}