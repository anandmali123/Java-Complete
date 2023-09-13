import java.util.*;
class LinkedListDemo{
	public static void main(String[] args){
	//	LinkedList ll=new LinkedList();
                ArrayList al=new ArrayList();
		al.add(30);
                 LinkedList ll=new LinkedList(al);
		ll.add(80);
		System.out.println(ll.pop());
		ll.addFirst(10);
		ll.addLast(40);
		ll.pop();
		System.out.println(ll.offer(23));
		System.out.println("Get First : "+ll.getFirst());
		System.out.println("Get Last : "+ll.getLast());

		System.out.println(ll);
	}
}

