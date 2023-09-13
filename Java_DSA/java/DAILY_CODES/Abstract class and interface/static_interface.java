interface Demo{
	static void fun(){
		System.out.println("In fun Demo");
	}
}

interface Demochild extends Demo{
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		Demo.fun();
	}
}

