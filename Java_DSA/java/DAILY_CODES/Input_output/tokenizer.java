import java.io.*;
import java.util.*;
class Demo{
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String info=br.readLine();
                System.out.println("enter CHIWDA_T brand kilo energy");
		StringTokenizer obj=new StringTokenizer(info," ");
		String t1=obj.nextToken();
		String t2=obj.nextToken();
		String t3=obj.nextToken();
//		String t4 = obj.nextToken();
		System.out.println("chiwda= "+t1);
		System.out.println("grade= "+t2);
		System.out.println("Kilo = "+t3);
//		System.out.println("enegy="+t4);

	}
}


