class Core2web{
	public static void main(String[] args){
		String s1=new String("Core2web");
		String s2=new String("Core2web");
		if(System.identityHashCode(s1).equals(System.identityHashCode(s2)))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
//here identityHashCode will returns integer value so that in if there is required Boolean value so we cannot convert
