class Outer{
	class Inner{
		
		Inner(){
			System.out.println("Inner Constructor");
		}
		void fun1(){
		        System.out.println(this);
			System.out.println("fun1-Inner class");
		}
		
	}
	void fun1(){
		System.out.println(this);
		System.out.println("Fun1-Outer class");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj=new Outer();
	        obj.fun1();
	        Outer.Inner obj2=new Outer().new Inner();
		obj2.fun1();
	}
}


	
