class Q48{
	public int searchInsert(int[] array, int target){
		int L=0; R= array.length -1;
		while(L<R){
			int M = (L+R)/2;
			if(array[M] < target){
				L = M+1;
			}
			else{
				R = M
			}
		}
		return (A[L] < target)?L+1:L;
	}
}