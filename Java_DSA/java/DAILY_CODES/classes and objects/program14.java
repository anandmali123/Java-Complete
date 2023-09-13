class Demo{
	int x=10;
	private int y=20;
	static int z=30;
	static int p=30;
}

	class Client{
	public static  void main(String[] args){
		Demo obj1=new Demo();
		Demo obj2=new Demo();
//        	obj1.disp();
		obj1.x=100;
		obj2.z=300;
  //              obj1.disp();
//		obj2.disp();
//		System.out.println(Demo.z);
                System.out.println("-----------------");
		System.out.println("identityHashCode code ");
		System.out.println("hashcode of x"+System.identityHashCode(obj1.x));
		System.out.println("hashcode of p"+System.identityHashCode(obj1.p));
                System.out.println("hashCode of z"+System.identityHashCode(obj1.z));

	
	}
}
//output
identityHashCode code 
hashcode of x482137851
hashcode of p1167214880
hashCode of z1984697014

