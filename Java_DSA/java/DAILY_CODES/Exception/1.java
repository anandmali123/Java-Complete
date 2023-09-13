class Demo{
	void m1()throws ArithmeticException{
		System.out.println(10/0);
		try{
		m2();}
		catch(ArithmeticException obj4){
			System.out.println("");
		}

	}

	void m2()throws ArithmeticException{
		try{
		System.out.println("In m2");}
		catch(ArithmeticException obj3){
			System.out.println("Exception in m2");
		}
	}

	public static void main(String[] args)throws Exception{
		Demo obj=new Demo();
//		try{
		obj.m1();
  //              catch(ArithmeticException obj1){
  //       	System.out.println(obj1);
//		}

	}
}

