class Operators { 
	public static void main(String args[]){

		int result = add(1,2);
		System.out.println(result);
		int result2 = subtract(2,1);
		System.out.println(result2);
		int result3 = devide(7,3);
		System.out.println(result3);
		int result4 = multipl(4,2);
		System.out.println(result4);
		int result5 = rest(7,3);
		System.out.println(result5);
		String result123 = div(7,3);
		System.out.println(result123);
		//System.out.println(factor1 +"="3 * + result3+"+"+result5);
		
	}

	public static int add(int termen1, int termen2){
		return termen1 + termen2;
	}
	public static int subtract(int factor1, int factor2){
		return factor1 - factor2;
	}
	public static int devide(int factor1, int factor2){
		return factor1 / factor2;
	}
	public static int multipl(int factor1, int factor2){
		return factor1 * factor2;
	}
	public static int rest(int factor1, int factor2){
		return factor1 % factor2;
	}
	public static String div(int factor1, int factor2){
		int devide =devide(factor1, factor2);
		int rest = rest(factor1, factor2);
		return factor1 + "=" +factor2 +"*"+devide+"+"+rest;
	}
}