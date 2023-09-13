import java.util.*;
class HashMapDemo{
	public static void main(String[] args){
		LinkedHashMap hm=new LinkedHashMap();
	        hm.put(2,3);
		hm.put(2,1);
		hm.put(5,6);
		hm.put(7,4);
		hm.put(4,6);
		System.out.println(hm);
	}
}

