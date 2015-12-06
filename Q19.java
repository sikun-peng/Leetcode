class Q19{
	public static boolean isPalidrome(int x){
		int div = 1;
		while(x/div > 10){
			div *= 10;
		}
		System.out.println(div);
		
		int y = x;
		while(y > 1){
			System.out.println(y + " " + y%10 + "  " + y/div);
			if(y%10 != y/div){
				return false;
			}
			y = (y%div)/10;
			div /= 100;
		}
		return true;
	}
	
	public static void main(String[] args){
		int x = 56565;
		System.out.println(isPalidrome(x));
		
	}
}