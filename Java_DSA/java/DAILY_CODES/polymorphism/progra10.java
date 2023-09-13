class Parent{
	Object fun(){
		Object a=new Object();
		System.out.println("Parent Fun");
	        return a;
	}
}
class Child extends Parent{
	String fun(){
		System.out.println("Child fun");
		return "anfs";
	}
}
class Client{
	public static void main(String[] args){

		Parent p=new Child();
		p.fun(p);
	}
}

