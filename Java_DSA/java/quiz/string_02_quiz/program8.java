class Demo{
	public static void main(String[] args){
		String var1="Anand";
		String var2="mali";
		if(var1==var1.concat(var2))
			System.out.println("hey");
		else if(var2==var1.concat(var2))
			System.out.println("hello");
		else
			System.out.println("Bye");
	}
}

