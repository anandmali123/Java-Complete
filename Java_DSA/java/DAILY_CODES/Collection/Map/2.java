import java.util.*;
class HashMapDemo{
        public static void main(String[] args){
                HashSet hs=new HashSet();
                hs.add("Kanha");
                hs.add("Ashish");
                hs.add("Badhe");
                hs.add("Rahul");
                System.out.println(hs);
             HashMap hm=new HashMap();
	     hm.put("Kanha","BMC");
	     hm.put("Ashish","Barclays");
	     hm.put("Kanha","CarPro");
	     hm.put("Rahul","BMC");
	     System.out.println(hm);
	}
}

