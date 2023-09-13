class Demo{
	void fun(String str){
		System.out.println("IN String ");
	}
	void fun(StringBuffer str){
		System.out.println("In stringbuffer");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun("Core2web");
		obj.fun(new StringBuffer("NKasfi"));
		obj.fun(null);
	}
}

