import java.util.*;
class Demo{
	void add(int a,int b){
		int ans=a+b;
	System.out.println(ans);
	}
	void mult(int a,int b){
		int ans=a*b;
		System.out.println("a*b= "+ans);
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Demo obj=new Demo();
		int a=sc.nextInt();
		int b=sc.nextInt();
		obj.add(a,b);
		obj.mult(a,b);
	}
}

