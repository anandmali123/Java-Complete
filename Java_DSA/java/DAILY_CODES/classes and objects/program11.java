 class Demo{
	int x=10;
	 int y=20;

	void fun(){
		System.out.println(x);
		 System.out.println(y);
	}
}
public class MainDemo{
	public static void main(String[] Demo){
		Demo obj=new Demo();
		obj.fun();

		System.out.println(obj.x);
		System.out.println(obj.y);
 
	//	System.out.println(x);
	//	System.out.println(y);
	}
}


