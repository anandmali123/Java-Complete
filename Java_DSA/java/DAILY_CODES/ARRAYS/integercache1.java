class Demo{
	void fun(int[] arr){
		arr[1]=300;
		arr[2]=400;
		System.out.println("300="+System.identityHashCode(arr[1]));
		System.out.println("400="+System.identityHashCode(arr[2]));
	}
	public static void main(String[] args){
		int arr[] ={10,20,30,40,50};
		System.out.println("10="+System.identityHashCode(arr[0]));
		System.out.println("20="+System.identityHashCode(arr[1]));
		System.out.println("30="+System.identityHashCode(arr[2]));
		System.out.println("40="+System.identityHashCode(arr[3]));
		System.out.println("50="+System.identityHashCode(arr[4]));

		Demo obj=new Demo();


		obj.fun(arr);
               // System.out.println("obj identityHashcode="+System.identityHashCode(obj.arr))
		for(int x:arr){
			System.out.println(x);
		}
	//	System.out.println(System.identityHashCode(x));
	//	System.out.println(System.identityHashCode(y));
                int x=300;
		int y=400;
		System.out.println("300="+System.identityHashCode(x));
		System.out.println("400="+System.identityHashCode(y));
	}
}

