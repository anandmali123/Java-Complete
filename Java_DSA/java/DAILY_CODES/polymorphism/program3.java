class Parent{
	Parent(){
	System.out.println("Parent Constructor");}
	void fun(){
		System.out.println("In Parent fun");
	}
        }

class Child extends Parent{
	Child(){
		System.out.println("Child Constructor");
	}
	void fun(){
		System.out.println("In CHild Fun");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj1=new Child();
		obj1.fun();
	}
}

