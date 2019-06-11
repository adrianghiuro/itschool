class AltaProblema{
	public static void main(String[] args){
		int [] factor = new int[]{2,5,1,89,16,3415,54};
		altul(factor);

		}

	public static void altul(int[] sir){
		for(int i=0; i<sir.length; i=i+2){
			System.out.println(sir [i]);
		}
	}
}


