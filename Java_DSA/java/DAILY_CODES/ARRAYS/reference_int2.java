class Demo{
	static void fun(int x,int y){
	
	//	System.out.println(y);
	        System.out.println(System.identityHashCode(x));
		

		x=x+10;
		y=y+10;
         System.out.println(System.identityHashCode(x));
	//	System.out.println(x);
	//	System.out.println(y);
	}
	public static void main(String[] args){
		int x=127;
		int y=22;

//		System.out.println(x);
//		System.out.println(y);
	System.out.println(System.identityHash
	Code(x));
		fun(x,y);
	//	System.out.println(x);
	//	System.out.println(y);
	System.out.println(System.identityHashCode(x));
	}
}

