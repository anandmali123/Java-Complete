import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String a=br.readLine();
		br.close();
		String b=br1.readLine();
	}
}
