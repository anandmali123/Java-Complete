import java.io.*;
class ExceptionDemo{
	public static void main(String[] args){
		int data=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
		String str=br.readLine();
		System.out.println(str);
                try{
		data=Integer.parseInt(br.readLine());}catch(NumberFormatException objs){
			System.out.println("please take int ");
		}
		}

		catch(IOException bh){
		System.out.println("Exception");
		}
		finally{
			System.out.println("Budu gum kar ghar aye");
		}try
		finally{
			System.out.println("knvfkd");
		}



		System.out.println(data);
	}
}

