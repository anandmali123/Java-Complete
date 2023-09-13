class Core2web{
	public static void main(String[] args){
		String str1="This is a String";
		String str2="a String";
		String s3="This is "+str2;
		if(System.identityHashCode(str1)==System.identityHashCode(str2)){
			System.out.println("equal");
		}
		else{
			System.out.println("Not equal");
		}
	}
}	
