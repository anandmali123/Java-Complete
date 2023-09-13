class Demo{
	static void fun(int arr[]){
	System.out.println(System.identityHashCode(arr[0]));
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]+40;
		}
	System.out.println(System.identityHashCode(arr[0]));
	}
	public static void main(String[] args){
		int arr[] ={50,100,150};
		System.out.println(System.identityHashCode(arr[0]));

		fun(arr);
		System.out.println(System.identityHashCode(arr[0]));
	}
}


