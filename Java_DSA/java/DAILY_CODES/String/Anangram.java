import java.util.*;
class Demo1{
          boolean AnagramString(String s,String s1){
	       char arr[]=s.toCharArray();
	       char arr1[]=s1.toCharArray();
	       Arrays.sort(arr);
	      Arrays.sort(arr1);
	    
	      return Arrays.equals(arr,arr1);
	  }
	  public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
		Demo1 obj=new Demo1();
		System.out.println("Enter a 1st string:");
		String s=sc.nextLine();
		System.out.println("Enter a 2nd String: ");
		String m=sc.nextLine();
             System.out.println(obj.AnagramString(s,m));
	  }
}

