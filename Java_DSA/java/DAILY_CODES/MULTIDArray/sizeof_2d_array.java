class Demo{
	public static void main(String[] arg){
		int[][] arr=new int[4][3];
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
	System.out.println(arr[0]);
	System.out.println(System.identityHashCode(arr[0][0]));
	}
}

