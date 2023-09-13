////Weaker HashMap
import java.util.*;
class Demo{
	String str;
	Demo(String str){
		this.str=str;
	}
	public String toString(){
		return str;
	}

	public void finalize(){
		System.out.println("Yes finalize get call in object class Due to garbage collector hides or removes ghe unreferece object from heap");
	}
}

class GCDemo{
	public static void main(String[] args){
		Demo obj1=new Demo("Anand");
		Demo obj2=new Demo("Dnyaneshwar");
		Demo obj3=new Demo("Mali");

		WeakHashMap hm=new WeakHashMap();
		hm.put(obj1,2016);
		hm.put(obj2,2013);
		hm.put(obj3,2021);
		obj1=null;
		System.gc();
		System.out.println(hm);
	}
}

