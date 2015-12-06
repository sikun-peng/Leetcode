class Q12{
	public static String findMissingRanges(int[] input, int start, int end){
		String s = "";
		for(int i = 1; i < input.length; i++){
			int d = input[i] - input[i-1];
			if(d == 2) {
				s = s+", " + Integer.toString(input[i]-1);
			}
			else if(d >= 2){
				s = s+ ", " + Integer.toString(input[i-1]+1)  + " -> " + Integer.toString(input[i] - 1);
			}
		
		}
		return s;
	}
	public static void main(String[] args){
		int[] a = { 1,2 , 3,56,57,59,80};
		System.out.println(findMissingRanges(a));
	}
}