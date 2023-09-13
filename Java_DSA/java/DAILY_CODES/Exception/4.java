import java.io.*;
class Input{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println(str);
	
		String str2=null;
		br.close();
		try{
	//	br.close();
		str2=br.readLine();
		}catch(IOException obj){
			obj.printStackTrace();
			System.out.println("IO Exception Occured");
		}
		

	//	String str2=br.readLine();
		System.out.println(str2);
	}
}

