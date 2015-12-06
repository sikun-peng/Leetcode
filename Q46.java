class Q46{
	public static int maxProduct(int[] array){
		
		int temp_max = array[0];
		int temp_min = array[0];
		int max = array[0];
		for(int i = 1; i< array.length; i++){
			temp_max = Math.max(Math.max(temp_max*array[i], array[i]), temp_min*array[i]  );
			temp_min = Math.min(Math.min(temp_min*array[i], array[i]), temp_max*array[i]);
			max = Math.max(max, temp_max);
		}
		
		return max;
	}
	
	public static void main(String[] args){
		
		int[] a = {2, 3, -2, 4};
		System.out.println(maxProduct(a));
	}
}