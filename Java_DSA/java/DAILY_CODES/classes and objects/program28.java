class DEmo{
	String str1 = null;
//	String str2 = new String("kk");

	DEmo(String str1){
		System.out.println(System.identityHashCode(this.str1));
//		System.out.println(System.identityHashCode(this.str2));
		System.out.println(System.identityHashCode(str1));
		this.str1 = str1;
	System.out.println(System.identityHashCode(this.str1));
	}
 public static void main(String [] args){
	 DEmo obj = new DEmo("Anand");

   


	 String str3="Anand";
	 System.out.println(System.identityHashCode(str3));

 }

}
