class Q6{
	
	public static String reverseWorld(String s){
		StringBuilder sb = new StringBuilder();
		int j = s.length();
		for(int i = s.length() - 1; i >= 0 ; i--){
			if(s.charAt(i) == ' ' || i == 0){		
				sb.append(s.substring(i, j));
				j = i;
				sb.append(" ");
			}
		}
		
		return sb.toString();
	
	
	}
	
	
	public static void main(String[] args){
		String s = "ab cde fg";
		System.out.println(reverseWorld(s));
		


	}
}