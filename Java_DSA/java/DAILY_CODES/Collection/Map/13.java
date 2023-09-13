import java.util.*;
class Platform{// implements{
	// Comparable{
	String  str=null;
	int foundyear =0;
	Platform(String str,int foundyear){
		this.str=str;
		this.foundyear=foundyear;
	}
	public String toString(){
		return "{"+str+":"+foundyear+"}";
	}
}
class SortByName  implements Comparator{
	public int compare(Object obj1,Object obj2){
		return ((Platform)obj1).str.compareTo(((Platform)obj2).str);
	}
}


class TreeMapdemo{
		public static void main(String[] args){
			TreeMap tm=new TreeMap(new SortByName());
			tm.put(new Platform("Youtube",2005),"Google");
			tm.put(new Platform("Instagram",2010),"Meta");
			tm.put(new Platform("Facebook",2004),"Meta");
			tm.put(new Platform("ChatGpt",2022),"OpenAI");
			System.out.println(tm);
		}
}
