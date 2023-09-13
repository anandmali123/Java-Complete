class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
	void fun(int x){
		System.out.println("In Parent Constructor");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child Constructor");
	}
	void fun(){
		System.out.println("In Child fun");
	}
}
class Client{
	public static void main(String [] args){
		Parent obj1=new Child();
		obj1.fun();
	}
}

