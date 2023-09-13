import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your interest?");
		System.out.println("1.Movies");
		System.out.println("2.Series");
	        int choice=Integer.parseInt(br.readLine());
		switch(choice){
			case 1:
				int p=Integer.parseInt(br.readLine());
				System.out.println("1.FOunder");
				System.out.println("2.Snowden");
				System.out.println("3.Jobs");
				System.out.println("4.Her");
				System.out.println("5.Social NEtwork");
				System.out.println("6.Wall-E");
				System.out.println("7.AI");



