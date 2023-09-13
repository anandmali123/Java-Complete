class Demo{
	int v=19;
	String s="Anand it is instantaneous String";
	static {
		System.out.println("In Static block 1");
		Demo br=new Demo();
		System.out.println(br.s + br.v);
	}
	public static void main(String[] arfs){
	System.exit(0);
	}

}

	 
