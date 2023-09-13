class Demo{
	void fun(){
		System.out.println("In fun method");
	}
	int x=10;
	static int y=32;
	static void gun(){
		System.out.println("In gun method");
	}
	public static void main(String[] args)
	{
		Demo obj=new Demo();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.gun();
	}
}
