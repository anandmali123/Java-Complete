import java.util.*;
class MyClass implements Comparable{
	String str=null;
	MyClass(String str){
		this.str=str;
	}
	public int compareTo(MyClass obj){
		return (obj.str).compareTo(this.str);
	}
	public String toString(){
		return str;
	}
}

class TreeSetDemo1{
	public static void main(String[] args){
		TreeSet ts=new TreeSet();
		ts.add(new MyClass("Kanha"));
		ts.add(new MyClass("Rahul"));
		ts.add(new MyClass("Badhe"));
       
		System.out.println(ts);
	}
}

			
