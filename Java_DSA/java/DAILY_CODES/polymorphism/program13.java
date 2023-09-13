class Parent{
	static void  fun(){
		System.out.println("In fun()");
	}
}
class Child extends Parent{
        void fun(){
		System.out.println("Child fun");
	//	return 1;
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun();
		Parent obj1=new Parent();
		obj1.fun();
		Child obj2=new Child();
		obj2.fun();

	}
}

