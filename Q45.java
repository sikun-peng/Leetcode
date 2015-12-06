class Q45{
	
	public static int maxSubArray(int[] array){
		return maxSubArrayHelper(array, 0, array.length -1);
	}
	
	private static int maxSubArrayHelper(int[] array, int start, int end){
		if(start > end){
			return Integer.MIN_VALUE;
		}
			int mid = (start+ end)/2;
			int left = maxSubArrayHelper(array, start, mid -1);
			int right = maxSubArrayHelper(array, mid+1, end);
			int left_max = 0;
			int sum = 0;
			for(int i = mid -1; i>= start; i--){
				sum += array[i];
				left_max = Math.max(sum, left_max);
			}
			int right_max = 0;
			sum = 0;
			for(int i = mid+1; i<= end; i++){
				sum += array[i];
				right_max = Math.max(sum, right_max);
			}
			return Math.max(left_max + array[mid] + right_max, Math.max(left, right));
		
	}
	
	
	
	/// dynamic programminmg
	/*
	public static int maxSubArray(int[] array){
		int temp = array[0];
		int max = array[0];
		for(int i = 1; i< array.length; i++){
			temp = Math.max(temp+ array[i], array[i]);
			max = Math.max(temp , max);
		}
		return max;
	}
	*/
	public static void main(String[] args){
		int[] a = {2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxSubArray(a));
	}
	
}