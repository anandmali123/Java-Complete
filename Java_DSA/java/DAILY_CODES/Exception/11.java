import java.util.Scanner;

class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		try{
			if(x==0)
				throw new ArithmeticException("Devide by zero");
		System.out.println(10/x);
		}
		catch(ArithmeticException ae){
			System.out.println("Exception in Thread "+Thread.currentThread()+" ");
//			ae.printStackTrace();
		ae.getMessage();
		}
	}
}

