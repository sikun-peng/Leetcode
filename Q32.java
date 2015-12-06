class Q32{
	public static TreeNode UpsideDown(TreeNode root){
		TreeNode cur = root. parent = null, parentRight = null;
		while(cur != null){
			TreeNode left = cur.left;
			parentRight = cur.right;
			cur.right = parent;
			parent = cur;
			cur = left;
		}
		return parent;
	}
	
	
	////////method 2
	public static TreeNode UpsideDown(TreeNode root){
		return BottomUp(root, null);
	}
	
	private TreeNode BottomUp(TreeNode cur , TreeNode parent){
		if(cur == null){
			return parent;
		}
		TreeNode root = BottomUp(cur.left, cur);
		cur.left = (parent == null)? parent: parent.right;
		cur.right = parent;
		return root;
	}
	
}