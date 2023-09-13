import java.util.*;
class Employee{
	String empName =null;

	float sal= 0.0f;

	Employee(String empName , float sal){
		this.empName =empName;
		this.sal=sal;
	}
	public String toString(){
		return "{"+empName+","+sal+"}";
	}
}

class SortByName implements Comparator<Employee> {
	public int compare(Employee obj1,Employee obj2){
		return obj1.empName.compareTo(obj2.empName);
	}
}

class SortBySal implements Comparator<Employee> {
	public int compare(Employee obj1,Employee obj2){
		return (int)(obj1.sal-obj2.sal);
	}
}
class ListSortDemo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add(new Employee("Kanha",2000000.00f));
		al.add(new Employee("Ahish",34534546.00f));
		al.add(new Employee("Badhe",456.00f));
		al.add(new Employee("Rhul",34.00f));
		System.out.println(al);

		Collections.sort(al,new SortByName());

		System.out.println(al);

		Collections.sort(al,new SortBySal());

		System.out.println(al);
	}
}

