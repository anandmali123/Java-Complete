import java.util.*;
class Winchance extends RuntimeException{
	Winchance(String msg){
		super(msg);
	}
}
class Match{
	public static void main(String[] args){
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			int runrate=sc.nextInt();

			if(runrate>36){
				throw new Winchance("Runrate should be greater than 36");
			}
			arr[i]=runrate;
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}
}


