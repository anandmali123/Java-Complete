interface A{
	int x=10;
}

interface B{
	int x=19;
}

class Child implements A,B{
	int x=30;
	void fun(){
		System.out.println(x);
	}
}

class Client{
	public static void main(String[] ags){
		A obj=new Child();
		obj.fun();
	}
}

