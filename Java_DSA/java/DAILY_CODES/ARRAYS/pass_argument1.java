class Demo{
	public static void main(String[] args){
		funDemo obj=new funDemo();
		int ret=obj.fun(10);
		System.out.println(ret);
	}
	int fun(int x){
		int val=x+324;
		return val;
	}
}

