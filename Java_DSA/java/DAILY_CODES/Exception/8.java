class Demo{
	void m1(){
	}
	void m2(){
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.m1();
		obj=null;
		try{
			obj.m2();
		}
		catch(NullPointerException objs){
			System.out.println("right");
		}
		catch(fileNotFoundException ons){
		}
		catch(InterruptedException old){
		}

		catch(ArithmeticException obj5){
			System.out.println("Here");
		}
		finally{
			System.out.println("Connection closed");
		}
		System.out.println("End Main");
	}
}


