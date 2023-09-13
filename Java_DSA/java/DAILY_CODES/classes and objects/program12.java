class Employees{
	int Empid=10;
	String str="kanha";

	void empInfo(){
		System.out.println("ID = "+Empid);
		System.out.println("Name = "+str);

	}
}
class MainDemo{
	public static void main(String[] args){
	Employees obj=new Employees();
	obj.empInfo();

	System.out.println(obj.Empid);
	System.out.println(obj.str);
}

}
