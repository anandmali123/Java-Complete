class Demo{
	void fun(Object obj){
		System.out.println("Object");
	}
	void fun(String str){
		System.out.println("String");
	}
}
class Client{
	 public static void main(String[] args){
		 Object obj1=null;
		 Demo obj=new Demo();
		 obj.fun("Core2web");
		 obj.fun(new StringBuffer("Core2web"));
		 obj.fun(null);
	 }
}

