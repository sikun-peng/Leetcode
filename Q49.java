class Q49{
	public int findMin(int[] a){
		int L = 0, R = a.length-1;
		while(L<R && A[L]>= A[R]){
			int M = (L+R)/2;
			if(a[M] > a[R]){
				L = M+1;
			}
			else{
				R= M;
			}
		}
		return A[L];
	}
}