interface Demo1{
	void fun();
}
interface Demo2{
     static 	void fun();
}
class DemoChild implements Demo1,Demo2{
      public	void fun(){
	      System.out.println("In child Fun");
      }

}
class Client{
	public static void main(String[] args){
		Demo1 obj=new DemoChild();
		obj.fun();

		Demo2 obj1=new DemoChild();
		obj1.fun();
	}
}

