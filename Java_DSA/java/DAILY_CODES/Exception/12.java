import java.util.Scanner;
class DataOverFlowException extends RuntimeException{
	DataOverFlowException(String msg){
		super(msg);
	}
}

class DataUnderFlowException extends RuntimeException{
	DataUnderFlowException(String msg){
		super(msg);
	}
}

class ArrayDemo{
	public static void main(String[] args){
		int arr[] =new int[5];
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter integer value");
		System.out.println("Note: 0< element <100");

		for(int i=0;i<arr.length;i++){
			int data=sc.nextInt();

			if(data<0)
				throw new DataUnderFlowException("Mitra data 0 peksha mota de ");

			if(data>100)
				throw new DataUnderFlowException("Mitra data 100 peksha lahan de ");

			arr[i]=data;
		}

		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]+" ");
	}
}
