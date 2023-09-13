class StringlengthDemo{
	static int mystrlen(String str){
		char[] arr=str.toCharArray();
		int count=0;
		for(int i:arr){
			count++;}
		return count;
	}
	public static void main(String[] ar){
		String s="Anand is my name";
	        System.out.println(s.length());
		System.out.println(s.indexOf(4));
	}
}

