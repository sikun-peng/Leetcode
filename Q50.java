class Q50{
	public int findMin(int[] a){
		int L= 0, R = a.length-1;
		while(L<R && a[l]>a[R]){
			int M = (L+R)/2;
			if(a[M] > a[R]){
				L= M+1;
			}
			else if(a[M] < a[L]){
				R = M;
			}
			else{
				L = L+1;
			}
		}
		return a[L];
	
	}
}