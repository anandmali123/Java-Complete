import java.util.*;
class Demo{
	public static void main(String[] args){
		NavigableSet ns=new TreeSet();
		ns.add(23);
		ns.add(22);
		ns.add(29);
		ns.add(49);
		ns.add(89);
		System.out.println(ns.lower(33));
		System.out.println(ns.floor(21));

		System.out.println("Higher of 28***: "+ns.higher(28));
		System.out.println("Ceiling of 50: "+ns.ceiling(50));
		System.out.println("Pollfirst of 24: "+ns.pollFirst());
		System.out.println("Polllast of 44: "+ns.pollLast());
	//	Iterator itr=ns.iterator();
	//	System.out.println("Implementationof Iterator : ");
	//	while(itr.hasNext()){
	//		System.out.println(itr.next());
	//	}
		System.out.println(ns.descendingSet());
//		System.out.println("Implement NavigableSet : descendingSet() itertor: ");

////		while(itr1.hasNext()){
//			System.out.println(itr1.next());
//		}
		
	       // Iterator itr2=new descendingIterator();
		//System.out.println("Iterating descendingITerator method which return Iterator: ");

	//	while(itr2.hasNext()){
	//		System.out.println(itr2.next());
	//	}
	System.out.println(ns.subSet(24,true,55, false));
System.out.println(ns.headSet(49,true));


		
	}
}

