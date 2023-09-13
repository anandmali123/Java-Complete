import java.util.*;
class Demo{
	public static void main(String[] args){
	//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int ecount=0,ocount=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
				ecount++;
			else
				ocount++;
		}
		System.out.println("even count= "+ecount);
		System.out.println("odd count= "+ocount);
		System.out.println(System.identityHashCode(arr[1]));
	}
}


