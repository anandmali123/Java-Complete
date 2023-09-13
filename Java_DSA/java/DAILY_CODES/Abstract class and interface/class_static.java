class Demo{
	static void fun(){
		System.out.println("In Demo - fun");
	}
}

class Child extends Demo{
}
class Client{
	public static void main(String[] args){
	   Demo obj=new Child();
	   obj.fun();

	}
}

