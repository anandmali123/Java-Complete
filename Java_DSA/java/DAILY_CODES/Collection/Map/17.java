import java.io.*;
import java.util.*;
class PropertiesDemo{
	public static void main(String[] args)throws IOException{
		Properties obj=new Properties();
		FileInputStream fobj=new FileInputStream("anand.txt");
		obj.load(fobj);
		String name=obj.getProperty("Ashish");
		System.out.println(name);
		obj.setProperty("Shashi","Biencaps");
		FileOutputStream outObj=new FileOutputStream("anand.txt");
		obj.store(outObj,"Updated by Shashi");
	}
}



