class StringDemo{
	public static void main(String[] args){
		String str1="Anand";
		String str2="ali";
		System.out.println("Anand "+str2);
		
		String str3="Anandmali";
            //   String str5="Anand"+str2;
	     String str5="Anand".concat(str2);
		String str4=str1+str2;
		if(str3==str5)
			System.out.println("Yes they are same str3 ane str5");
		else
			System.out.println("No they are not equal str3 and str5");
		if(str3==str4){
			System.out.println("str3 and str4 equal");
		}	
		else
			System.out.println("str3 and str4 not equal");

			
		System.out.println(System.identityHashCode(str1));
                 System.out.println(System.identityHashCode(str2));
		 System.out.println(System.identityHashCode(str3));
		 System.out.println(System.identityHashCode(str4));
		 System.out.println(System.identityHashCode(str5));


	}
}

