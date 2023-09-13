import java.util.*;
class Cursordemo{
       public static void main(String[] args){
      ArrayList al=new ArrayList();
      al.add("kanha");
      al.add("Rahul");
      al.add("Ashish");
      for(var x: al){
	      System.out.println(x.getClass().getName());//java.lang.String
      }

      //Iterator 
      Iterator cursor = al.iterator();
      System.out.println("Class Name : "+cursor.getClass().getName());//ArralIst$itr

      while(cursor.hasNext()){
	      if("kanha".equals(cursor.next())){
		      cursor.remove();
		     }
	      System.out.println(al);
      }

  //    list Iterator
        ListIterator litr =al.listIterator();
         System.out.println("List Iterator class Name : "+litr.getClass().getName());
	while(litr.hasNext()){
		System.out.println(litr.next());



       }
       while(litr.hasPrevious()){
	       System.out.println(litr.previous());
       }
       }
        al.clear();
      


}






