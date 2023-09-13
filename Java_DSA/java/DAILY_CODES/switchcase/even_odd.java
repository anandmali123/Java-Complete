import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Enter a first number ");
	      int first=Integer.parseInt(br.readLine());
	      System.out.println("Enter a second line ");
	      int second=Integer.parseInt(br.readLine());
	      if(first>0 && second>0){
		     switch(first*second%2){
			     case 0:
				    System.out.println("Even ");
				   break;
			    case 1:
				  System.out.println("ODD ");
				 break;
			    }
	      }
	      else{
		     switch(1){
			     default:
				    System.out.println("Negative ");
		     }
	      }
	}
}	
