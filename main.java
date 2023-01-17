	public static int vectorSum(int[] x) {
		
		int sum = 0;
		
		for (int i = 0; i < x.length; i++) {
			
			sum = sum + x[i];
			
		}
		
		return sum;
	}
	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5};
		
		System.out.println(vectorSum(x));
	}


