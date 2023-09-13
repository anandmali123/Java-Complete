class Parent{
	static int x=10;
	static {
		System.out.println("In static block 1");
	}
	static void access(){
		System.out.println("access method call i am in parent method");
	}
}
class Child extends Parent{
	static int y=20;
	static {
		System.out.println("Child static block");
		System.out.println(x);
		access();
	}
}
class Client{
	public static void main(String[] args){
		System.out.println("In main");
	        Child obj=new Child();
		obj.access();
	}
}

