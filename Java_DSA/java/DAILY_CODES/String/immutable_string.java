class StringDemo{
	public static void main(String[] args){
		String s1="Anand";
		System.out.println(System.identityHashCode(s1))
			;
            s1="Ml";
		System.out.println(System.identityHashCode(s1));
	}
}

