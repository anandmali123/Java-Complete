class Parent{
	Parent(){
		System.out.println("Parent constructor address "+this);
		System.out.println("In Parent Constructor");
	}
	void fun(){
		System.out.println("In Parent fun");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child constructor address "+this);
		System.out.println("In Parent Constructor");
	}

	void fun(){
		System.out.println("In Child fun");
	}
	void gun(){
		System.out.println("In CHild gun");
	}
}
class Client{
	public static void main(String[] args){
               
		Parent obj1=new Child();
		Child obj2=new Parent();

	}
}

