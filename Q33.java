class Q33{
	//////
	public int singleNumber(int[] array){
		Map<Integer, Integer> map = new HashMap<>();
		for(int x: array){
			int count = map.containsKey(x)? map.get(x):0;
			map.put(x, count+1);
		}
		for(int x:A){
			if(map.get(x) == 1){
				return x;
			}
		}
		throw new IllegalArgumentException("No single find");
	}
	
	//////
	public int singleNumber(int[] array){
		Set<Integer> setr = new HashSet<>();
		for(int x: array){
			if(set.contains(x)){
				set.remove(x);
			}
			else{
				set.add(x);
			}
		}
		return set.iterator().next();
		
	}
	
}