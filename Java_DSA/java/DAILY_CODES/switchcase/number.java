import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number from 0 to 5 ");
		int marks=Integer.parseInt(br.readLine());
		switch(marks){
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
			      System.out.println("two");
			      break;
			     case 3:
			      System.out.println("Three");
			      break;
			     case 4:
			      System.out.println("Four");
			      break;
			     case 5:
			      System.out.println("five");
			      break;
			     default:
			      System.out.println("number greater than 5");
			    
		}
	}
}

