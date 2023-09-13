import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		int size=Integer.parseInt(br.readLine());
		int [] arr=new int[];
		for(int i=0;i<6;i++){
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		System.out.println("sum of array is : "+sum);
	}
}

