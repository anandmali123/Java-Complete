import java.util.*;
class Subject {
	String name=null;
	int marks=0;

	Subject (String name, int marks){
		this.name =name;
		this.marks=marks;
	}
	public String toString(){
		return "{"+name+","+marks+"}";
	}
}

class SortByName implements Comparator<Subject> {
	public int compare(Subject obj1,Subject obj2){
		return (obj1.name).compareTo(obj2.name);
	}
}

class SortByMarks implements Comparator<Subject>{
	public int compare(Subject obj1,Subject obj2){
		return (int) (obj1.marks -obj2.marks);
	}
}

class ListSortDemo{
	public static void main(String[] args){
		ArrayList<Subject> al=new ArrayList<Subject>();

		al.add(new Subject("TOC",56));
		al.add(new Subject("ML",46));
		al.add(new Subject("PA",56));
		al.add(new Subject("CNS",55));

		System.out.println(al);

		Collections.sort(al,new SortByName());

		System.out.println(al);

		Collections.sort(al,new SortByMarks());

		System.out.println(al);
	}
}

