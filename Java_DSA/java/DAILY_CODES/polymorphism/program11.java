class Parent{
	Object fun(){
		System.out.println("In Object class Method ");
		return new Object();
	}
}
class Child extends Parent{
     String  fun(){
		System.out.println("In String class Method");
		return "Hello";
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun();
	}
}

