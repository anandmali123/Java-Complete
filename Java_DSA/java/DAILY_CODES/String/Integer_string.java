class StringDemo{
	public static void main(String[] args){
		int arr[]={10,200,300};
		Integer arr1[]={10,200,300};
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));

		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr1[1]));
		System.out.println(System.identityHashCode(arr1[2]));
		
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));

		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr1[1]));
		System.out.println(System.identityHashCode(arr1[2]));


	}
}


