class Const{
	Const(){
		System.out.println("In constructor");
	}
	void fun(){
		Const obj=new Const();
		System.out.println(obj);
	}
	public static void main(String[] args){
		Const obj1=new Const();
		System.out.println(obj1);

		Const obj2=new Const();
		System.out.println(obj2);

		obj1.fun();

//		System.out.println(System.identityHashCode(obj1.fun()));

	}
}

