class Employee{
	int empid=10;
	String name="Kanha";
	static int y=50;

	void empinfo(){
		System.out.println("Id = "+empid);
		System.out.println("Name= " +name);
		System.out.println("y= "+y);
	}
}
class MainDemo{
	public static void main(String[] args){
		Employee emp1=new Employee();
		Employee emp2=new Employee();

		emp1.empinfo();
		emp2.empinfo();

		System.out.println("-----------------------------");

		emp2.empid =20;
		emp2.name="Rahul";
		emp2.y=50000;

		emp1.empinfo();
		emp2.empinfo();
	}
}

