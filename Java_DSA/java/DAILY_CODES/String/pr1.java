class integerCache{
	void fun(Integer[] arr){
		arr[1]=70;
		arr[2]=80;

		System.out.println(System.identityHashCode(arr));
	}
       public static void main(String[] args){
	       integerCache obj=new integerCache();

	       int arr[]=new int[]{1000,2000,3000,4000};

	       System.out.println(System.identityHashCode(arr[0]));
	       System.out.println(System.identityHashCode(arr[1]));
	       System.out.println(System.identityHashCode(arr[2]));
	       System.out.println(System.identityHashCode(arr[3]));

	         obj.fun(arr);

		 System.out.println(System.identityHashCode(arr[0]));
		 System.out.println(System.identityHashCode(arr[1]));
		 System.out.println(System.identityHashCode(arr[2]));
		 System.out.println(System.identityHashCode(arr[3]));

		 int x=70;
		 int y=80;

		 System.out.println(System.identityHashCode(x));
		 System.out.println(System.identityHashCode(y));

		 System.out.println(System.identityHashCode(arr));
       }
}

