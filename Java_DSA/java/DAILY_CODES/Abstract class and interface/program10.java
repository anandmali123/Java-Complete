interface Atm{
	int x=10;//public static final
	void fun();
}

class DemoChild implements Atm{
	public void fun(){
		System.out.println(x);
		System.out.println(Atm.x);
	}
}
 
class Client{
	public static void main(String[] args){
		Atm obj=new DemoChild();
		obj.fun();
	}
}


