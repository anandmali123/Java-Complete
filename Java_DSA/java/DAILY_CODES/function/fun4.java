class Demo{
	public static void main(String[] args){
		Demo obj =new Demo();
		obj.fun(10);
		obj.fun(10.5f);
	//	obj.fun('a');
	//	obj.fun(10`);
		obj.fun(1);

	}
	void fun(float x){
		System.out.println("In fun");
		System.out.println(x);
	}
}

