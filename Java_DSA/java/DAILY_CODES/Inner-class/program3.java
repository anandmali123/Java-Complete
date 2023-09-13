class PM{
	static class  police{
		void m1(){
			System.out.println("Here police are static ");
		}
	}
	public static void main(String[] args){
		police obj=new  PM.police();
		obj.m1();
	}
}

