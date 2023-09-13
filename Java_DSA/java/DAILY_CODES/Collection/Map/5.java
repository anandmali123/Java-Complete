import java.util.*;
class HashDemo{
	public static void main(String[] args){
		HashMap hm=new HashMap();
		hm.put("Java",".java");
		hm.put("Python",".py");
		hm.put("Dart",".dart");
		System.out.println(hm);


		//get();
		System.out.println(hm.get("Python"));

		//KeySet

		System.out.println(hm.keySet());

		//values
		System.out.println(hm.values());

		//entrySet
		//
		System.out.println(hm.entrySet());

	}
}

