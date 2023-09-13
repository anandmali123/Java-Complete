class Stringconcate{
	public static void main(String[] args){
		StringBuffer str1=new StringBuffer("core2web");
		String str2="Bagal";
		String str3="Shashi";

		String str4=str2.concat(str3);
		StringBuffer str5=str1.append(str2);
		System.out.println(System.identityHashCode(str1));//100
		System.out.println(System.identityHashCode(str5));//100
		System.out.println(System.identityHashCode(str4));//200
		System.out.println(System.identityHashCode(str2));//300
	}
}

