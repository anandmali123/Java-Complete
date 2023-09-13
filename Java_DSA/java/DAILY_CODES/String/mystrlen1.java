import java.io.*;
class length1{
	static int mystrlen(String s){
		char[] arr=s.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++){

			count++;
		}
	 //  Class<? extends arr> cls=arr.getclass();
	  // System.out.println(cls.getName());
	 return count;
	}

	public static void main(String[] a)throws IOException{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 String s=br.readLine();
	 String s1=br.readLine();
	 if(mystrlen(s)==mystrlen(s1))
		  System.out.println("equal String");
	 else
		 System.out.println("not equal String");
	 length obj=new length();
	 Class<? extends length1> cls=obj.getclass();
	 System.out.println(cls.getName());

	// System.out.println(arr.getclass().glassName());
	}
}


