import java.io.*;
class Demo{
	static void Palindrome(String s){
		StringBuilder sb=new StringBuilder(s).reverse();
		String r=sb.toString();
		if(s.equals(r))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}
    public static void main(String[] args)throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   System.out.print("Enter a String: ");
	    String s=br.readLine();
	   Palindrome(s);
    }
}


	  
