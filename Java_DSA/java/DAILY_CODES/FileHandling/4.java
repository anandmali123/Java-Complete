import java.io.*;
class FileMethods{
	public static void main(String[] args)throws IOException{
		File fobj1=new File("Incubator.txt");
		fobj1.createNewFile();
		System.out.println("GetName: "+fobj1.getName());
		System.out.println("Parent Name: "+fobj1.getParent());
		System.out.println(" PAth of the file"+fobj1.getPath());
		System.out.println("is the file can read or not: "+fobj1.canRead());
		System.out.println(":is the file exist: "+fobj1.exists());
		System.out.println("is file directory: "+fobj1.isDirectory());
		System.out.println("is file:"+fobj1.isFile());
		System.out.println("IS the file is hidden : "+fobj1.isHidden());
		System.out.println("last modified of the file : "+fobj1.lastModified());
		String[] an=fobj1.list();
		System.out.println("list is : "+an);
		System.out.println("Delete the file: "+fobj1.delete());

	}
}




