import java.io.*;
class DesrializationDemo{
//	public static void main(String[] args){
		public static void main(String[] args)throws IOException,ClassNotFoundException{
			FileInputStream fis=new FileInputStream("PlayerDAta.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Player  obj1=(Player)ois.readObject();
			Player obj2=(Player)ois.readObject();
			ois.close();
			fis.close();
			System.out.println("jerNo: "+obj1.jerNo);
			System.out.println("Name: "+obj1.pName);
			System.out.println("jerNo: "+obj2.jerNo);
			System.out.println("Name:"+obj2.pName);
		}
	}



