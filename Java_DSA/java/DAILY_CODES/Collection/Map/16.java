import java.util.*;
class DictionaryDemo{
	public static void main(String[] args){
		Dictionary dt=new Hashtable();
		dt.put(10,"Sachin");
		dt.put(20,"MSD");
		dt.put(39,"Virat");
		dt.put(30,"KLRahul");
		dt.put(45,"Rohit");
		System.out.println(dt);

		//keys
	       Enumeration itr1= dt.keys();
       while(itr1.hasMoreElements()){
             System.out.println("Keys= "+itr1.nextElement()+" ");
           	     
	}
       System.out.print();
        //elements 
	Enumeration itr2=dt.elements();
	while(itr2.hasMoreElements()){
		System.out.print("Elements are : "+itr2.nextElement()+" ");
	}
	System.out.print();

	//elements 
	 
//	Enumeration itr2=ht.();
//	while(itr2.hasMoreElements()){
//		System.out.println(itr2.nextElement()+" ");
//	}
	System.out.println(dt.get(10));
	dt.remove(1);
	System.out.println(dt);

	}
}


