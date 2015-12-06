class Q7{

	public static void reverseWord(char[] s){
		reverse(s, 0, s.length);	
		System.out.println(s);
		int i = 0;
		for(int j = i; j < s.length; j++){
			System.out.println("i " +i); 
			if(s[j] == ' '){
				reverse(s, i , j);
				System.out.println("go");
				i = j;
			}
		}
		
	}

	private static void reverse(char[] s, int begin, int end){
		for(int i = begin; i < (end - begin)/2; i++){
				char temp = s[i];
				s[i] = s[end - i + begin -1];
				s[end - i + begin -1] = temp;
		}
	}
	
	public static void main(String[] args){
		String st = "abc def gh nima";
		char[] s = st.toCharArray();	
		//reverse(s, 0, 3);
		reverse(s, 1, 3);
		//reverseWord(s);
		System.out.println(s);
		
	}

}