import java.util.*;
class Player{
	String name =null;
	int runs=0;
	int sal=0;

	Player(String name,int runs, int sal){
               this.name =name;
	       this.runs=runs;
	       this.sal=sal;
	}

	public String toString(){
		return "{"+name +","+runs+","+sal+"}";

		//	return "{"+name+","+runs+","+sal+"}";
	}
}
class SortByname implements Comparator
{
	public int compare(Object obj1,Object obj2){
		return (((Player)obj1).name).compareTo(((Player)obj2).name);
	}
}
class SortByruns implements Comparator {
	public int compare(Object obj1,Object obj2){
		return (int)((((Player)obj1).runs)-(((Player)obj2).runs));
	}
}
class SortBysal implements Comparator{
	public int compare(Object obj1,Object obj2){
		return (int)((((Player)obj1).sal)-(((Player)obj2).sal));
	}
}
class UserListSort{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add(new Player("Rutu",99,10));
		al.add(new Player("Samson",45,6));
		al.add(new Player("Verma",60,7));
		al.add(new Player("Akash",2,6));

		System.out.println(al);
		Collections.sort(al,new SortByruns());
		System.out.println("Sort by runs: "+al);
		Collections.sort(al,new SortBysal());
		System.out.println("Sort by sal : "+al);

		Collections.sort(al,new SortByname());
		System.out.println("Sort by name: "+al);
	}
}


		

