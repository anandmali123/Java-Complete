class Demo{
	static int y=10;
	int x=20;
	static{
		System.out.println("In static block 1");
	}
	{
		System.out.println("In instatnce 1");
	}

	Demo(){
		System.out.println("In constructor");
	}
	public static void main(String[] args){
		Demo obj1=new Demo();
	}
	static{
		System.out.println("In static block 2");
	}
	{
		System.out.println("In instatnce block 2");
	}

}

