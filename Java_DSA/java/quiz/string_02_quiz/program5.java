class Demo{
	public static void main(String[] args){
	StringBuffer var1=new StringBuffer("Anand");
	StringBuffer var2=new StringBuffer("Anand");
	System.out.println(var1.equals(var2));
	var1.setLength(3);
	System.out.println(var1);
}
}
