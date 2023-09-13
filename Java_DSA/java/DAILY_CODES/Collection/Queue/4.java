import java.util.*;
class DequeueDemo{
	public static void main(String[] args){
		Deque obj=new ArrayDeque();
		obj.offer(10);
		obj.offer(40);
		obj.offer(20);
		obj.offer(30);
		System.out.println(obj);

		//offerFirst()
		//offerLast()
		obj.offerFirst(5);
		obj.offerLast(50);

		System.out.println(obj);

		//pollFirst
		//pollLast
		obj.pollFirst();
		obj.pollLast();
		System.out.println(obj);

		//peekFirst()
		//peekLast()
		obj.peekFirst();
		obj.peekLast();
		System.out.println(obj);
		//iterator
		Iterator itr=obj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		Iterator itr2=obj.descendingIterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());

		}
	}
}



