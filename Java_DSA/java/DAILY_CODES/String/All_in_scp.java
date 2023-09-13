class StringDemo{
	public static void main(String[] args){
		String str1="Anand";
		String str2="Anand";

		String str3=new String("Anand");
		String str4=new String("Anand");
		String str5=new String("Mali");

		String str6="Mali";
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
                 System.out.println(System.identityHashCode(str6));
	}
}
 
