import java.util.*;
class IdentityHashMapDemo{
	public static void main(String[] args){
		IdentityHashMap ihm=new IdentityHashMap();
		ihm.put(new String("Anand"),"kanha");
		ihm.put(new Integer(20),"Rahul");
		ihm.put(new String("Shreyash"),"badhe");

		System.out.println(ihm);

	}
}

