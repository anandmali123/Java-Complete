import java.io.*;
class FileDemo{
	public static void main(String[] args)throws IOException{
		int count =0;///home/anand/NEW_Java/Java_DSA/ja/home/anand/NEW_Java/Java_DSA/ja;
		File fobj=new File("/home/anand/NEW_Java/Java_DSA/java/DAILY_CODES/FileHandling/4.java");
		System.out.println(fobj.exists());
		String[] files=fobj.list();
		for(String str: files){
			File f=new File(str);
			if(f.isFile()){
				count++;
			}}
			System.out.println(count);
		
	}
}


