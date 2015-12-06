class Q11{

	public static int lengthOfLongestSubstringTwoDistinct(String s) {
	int sign = -1; 
	int start = 0, max = 0;
		for(int i = 1; i< s.length(); i++){
			if( s.charAt(i) == s.charAt(i-1)){
				continue;
			}
			if( sign > 0 && s.charAt(sign) != s.charAt(i)){
				max = Math.max(i - start, max);
				start = sign +1;
			}
			sign = i - 1;
		
		
		}
		return Math.max(max, s.length() - start);
	}
	
	public static void main(String[] args){
	String s = "aabcccc";
	System.out.println("gooooo");
	System.out.println(lengthOfLongestSubstringTwoDistinct(s));
	
	}

}



