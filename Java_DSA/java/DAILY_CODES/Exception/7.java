import java.io.*;
class ExceptionDemo{
	public static void main(String[] args)throws IOException,NumberFormatException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println(str);

		int data=0;

		try{
			data=Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException obj){
			System.out.println("Please enter integer data");
			try{
			data=Integer.parseInt(br.readLine());}
			catch(NumberFormatException oj){
				System.out.println("beta int value dalo");
			}
			
		}
		System.out.println(data);
	}
}

