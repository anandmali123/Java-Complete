class StringDemo{
	public static void main(String[] args){
		StringBuffer str=new StringBuffer("Anand is my name");
		System.out.println(System.identityHashCode(str));
		str.append("and yuour name ");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
	}
}

