import java.util.*;

//answer from book
class Q18{
	
	public static void plusOne(List<Integer> digits) {
		for (int i = digits.size() - 1; i >= 0; i--) {
			int digit = digits.get(i);
			if (digit < 9) {
				digits.set(i, digit + 1);
				return;
			} 
			else {
				digits.set(i, 0);
			}
		}
		digits.add(0);
		digits.set(0, 1);
		}
		
	public static void print(List<Integer> list){
		for(int i = 0; i< list.size(); i++){
			System.out.print("  "+ list.get(i));
		}
	}
	
	
	
	public static void main(String[] args){
		List<Integer> a = new List<Integer>();
		//a.add(123);
		//a.add(456);
		print(a);
		plusOne(a);
		print(a);
	}
}