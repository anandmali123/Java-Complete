import java.util.*;
class Employee {
	int empId=0;
	String name=null;
	Employee(int empId, String name){
		this.empId=empId;
		this.name=name;
	}
	public String toString(){
		return empId+" : "+name;
	}
}
class Demo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add(new Employee(1,"Anand"));
		al.add(new Employee(2,"Dnyaneshwar"));
		al.add(new Employee(3,"Mali"));
		System.out.println(al);
		Collections.sort(al,(obj1,obj2)->{
			return ((Employee)obj1).name.compareTo(((Employee)obj2).name);
		}
		);
		System.out.println(al);
	}
}

	
