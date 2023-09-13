import java.util.Scanner;


class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(0);
		int y=sc.nextInt();

		Addition obj=new Addition(x,y);
		System.out.println(obj.add());
	}
}

