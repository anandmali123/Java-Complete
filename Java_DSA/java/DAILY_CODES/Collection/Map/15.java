import java.util.*;
class HashtableDemo{
	public static void main(String[] args){
		HashMap hm=new HashMap();
		hm.put(12,2);
		Hashtable ht=new Hashtable(hm);
		ht.put(10,"Sachin");
		ht.put(7,"MSD");
		ht.put(18,"Virat");
		ht.put(1,"KLRahul");
		ht.put(45,"Rohit");

		System.out.println(ht);
	}
}

