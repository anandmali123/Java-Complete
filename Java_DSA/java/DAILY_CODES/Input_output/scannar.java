import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your info ");
		String str=obj.nextLine();
		StringTokenizer sr=new StringTokenizer(str," ");
		System.out.println(sr.countTokens());
		while(sr.hasMoreTokens()){
			System.out.println(sr.nextToken());
		}
	}
}
