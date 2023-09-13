import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		System.out.println("String = "+str1);

		br.close();

		char ch=(char)   isr.read();
		System.out.println("char+"+ch);
	}
}

