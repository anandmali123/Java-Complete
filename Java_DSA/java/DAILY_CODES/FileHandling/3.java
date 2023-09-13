import java.io.*;
class FolderDemo{
	public static void main(String[] args)throws IOException{
		File fd=new File("Anand");
		fd.mkdir();
		File obj1=new File(fd,"Code");

		obj1.createNewFile();
	}
}

