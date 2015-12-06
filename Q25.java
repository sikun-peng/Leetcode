class Q25{
	
	/*
	public static boolean isValidBST( TreeNode root){
		return valid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private boolean valid(TreeNode p, int low, int high){
		if(p == null){
			return true;
		}
		return p.val > low && p.val <high && valid(p.left, low, p.val) && valid(p.right, p.val, high);
	}
	
	*/
	
	private TreeNode prev;
	private static boolean isIncreasing( TreeNode p){
		if(p == null){
			return true;
		}
		
		if(isIncreasing(p.left)){
			if(prev != null && p.val <= prev.val){
				return false;
			}
			prev = p;
			return is isIncreasing(p.right);
		}
		return false;
	}
	
	public static boolean isValidBST(TreeNode root){
		prev = null;
		return isIncreasing(root);
	}
}