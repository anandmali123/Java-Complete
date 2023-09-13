import java.io.*;
class FileDemo{
	public static void main(String[] args)throws IOException{
		FileWriter fw=new FileWriter("Incubator.txt");
		fw.write("Flutter\n");
		fw.write("Backend\n");
		fw.write("Frontend\n");
		fw.close();
	}
}


