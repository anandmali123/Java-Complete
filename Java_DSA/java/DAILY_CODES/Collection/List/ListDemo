import java.util.*;
public class ListDemo extends ArrayList{
	public static void main(String[] args){
	    ArrayList obj = new ArrayList();
	    obj.add(10);
	    obj.add(100);
	    obj.add("Anand");
	    obj.add("react");
	    obj.add("Project explain");
	    obj.add("prepare for interview ");
	    obj.add("Solve Problems ");
            
	   System.out.println("Size of the ArrayList : "+ obj.size());

	   System.out.println("Contains Method  : "+obj.contains("Anand"));
	   List obj1=new ArrayList();
           obj.add(obj1);
	   obj.add("react");
           System.out.println("indexof(obj) : "+obj.indexOf(10));
	   System.out.println("React from last first "+obj.lastIndexOf("react"));
	   System.out.println("Get the Elements of the List "+obj.get(3));
	   System.out.println("Replace react by Incubator "+obj.set(3,"Incubator"));
	   System.out.println("Whole list is "+obj);


	   obj.remove(4);
	   System.out.println(obj);

	   ArrayList obj2=new ArrayList();
	   obj2.add("Sofa");
	   obj2.add("Bike");
	   obj2.add("Dresses");
	   obj2.add("Medicine");
	   obj2.add("Check up ");
	   obj2.add("Cooler");
	   obj2.add("All Jimmedari");
	    
	  obj.addAll(obj2);
	  System.out.println("Obj2 size " + obj2.size());
	  System.out.println("obj1.size " + obj.size());
	  ListDemo obj4=new ListDemo();
	  obj4.addAll(obj);
	  obj4.removeRange(8,14);
	  System.out.println("After adding obj2 to obj : "+obj);

	  Object[] arr=obj.toArray();
	  System.out.println("Array is arr: "+arr);


         
       for(Object data: arr){
	       System.out.print(data+ " ");
       }
       System.out.println(arr);

       System.out.println("-----------------------------------------------------");
       obj.checkInvariants();

              


	}

}

