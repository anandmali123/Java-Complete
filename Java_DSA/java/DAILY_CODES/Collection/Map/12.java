import java.util.*;
class TreeMapDemo{
	public static void main(String[] args){
		SortedMap tm=new TreeMap();
		tm.put("Ind","India");
		tm.put("Pak","pakistan");
		tm.put("SL","Srilanks");
		tm.put("Aus","Australia");
		tm.put("Ban","Bangladesh");
		System.out.println(tm);

		System.out.println(tm.subMap("Aus","Pak"));

		//headMap
		System.out.println(tm.headMap("Pak"));

		//tailmap
		System.out.println(tm.tailMap("Pak"));

		//FirstKey
		System.out.println(tm.firstKey());

		//lastKey()
		System.out.println(tm.lastKey());

		//Keyset
		System.out.println(tm.keySet());

		//values
		System.out.println(tm.values());

		System.out.println(tm.entrySet());
	}
}

