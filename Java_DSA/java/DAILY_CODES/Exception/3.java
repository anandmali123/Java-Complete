import java.io.*;
class Demo{
	void getdata()throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int data=0;

		try{
			data=Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException obj){
		//	obj.printstacktrace();
		}
		System.out.println(data);
	}
	public static void main(String[] args){
		Demo obj1=new Demo();
		obj1.getdata();
	}
}

