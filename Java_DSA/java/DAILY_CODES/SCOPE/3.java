class core2web{
	public static void main(String[] args){
		int x=20;
		{
			int y=20;
			System.out.println(x+" "+y);
		}
		{
			int y=23;
			System.out.println(x+" "+y);
		}
		System.out.println(x+" "+y);
	}
}
