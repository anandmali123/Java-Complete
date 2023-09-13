import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		int arr[] =new int[]{2,1,2,3};
		System.out.println(System.identityHashCode());
		System.out.println(arr);
		System.out.println(System.identityHashCode(arr[2]));
	}
}
