import java.util.*;
class IteratorDemo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();

		al.add("Kanha");
		al.add("Rahul");
		al.add("Ashish");

		Iterator itr=new al.();

		while(itr.hashNext()){
			if("Rahul".equals(itr.next()))
				   itr.remove();
			System.out.println(itr.next());
		}
	System.out.println(al);
	}
}

