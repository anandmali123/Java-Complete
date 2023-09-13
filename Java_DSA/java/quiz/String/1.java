class StringDemo{
	public static void main(String[] args){
		String s1=new String("Anand");
		String s2=new String("Anand");
		if(s1==s2)
			System.out.print("True 1");
		if(s1.equals(s2))
			System.out.print("true 2");
		if(s1.hashCode()==s2.hashCode())
			System.out.print("true 3");
	}
}

