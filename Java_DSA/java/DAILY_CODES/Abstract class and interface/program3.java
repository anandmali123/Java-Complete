interface Demo{
	void gun();
	void fun();
}
abstract class Demochild implements Demo{
        public 	 void gun(){
		System.out.println("gun");
	}
	

}
class Demochild1 extends Demochild{
	public void fun(){
		System.out.println("In fun");
	}
}

class Client{
	public static void main(String[] args){
		Demo obj=new Demochild1();
		obj.gun();
		obj.fun();
	}
}

