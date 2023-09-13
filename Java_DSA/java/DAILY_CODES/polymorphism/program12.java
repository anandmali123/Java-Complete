class Parent{
 	int fun(){
		System.out.println("In Parent fun");

return 1;  }
}
class Child extends Parent{
	void  fun(){
		System.out.println("In child fun");
	//	return 0;
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun();
	}
}

