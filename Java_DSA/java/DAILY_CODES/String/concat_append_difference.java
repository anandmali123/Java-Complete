/* 
 -append is of StringBuilder class and + operator internally work as append operator and add a string 
 - concat is of String class Method and it work as same as append 
 - */
class StringDemo{
	public static void main(String[] a){
		String str1="Shashi";
		String str2="Shashi";
		String str3=str1+str2;
		String str4=str1.concat(str2);

		System.out.println(str1+" "+str1.hashCode());
		System.out.println(str2+" "+str2.hashCode());
		System.out.println(str3+" "+str3.hashCode());
		System.out.println(str4+" "+str4.hashCode());
	}
}

