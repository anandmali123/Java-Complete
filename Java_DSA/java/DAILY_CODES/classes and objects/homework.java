class Office{
	int mylaptopid=101;
String myCompanyDesk="Anand Desk";
         static	String Food_court="lunch";
	void officeinfo(){
		System.out.println("mylaptopid "+mylaptopid);
		System.out.println("myCompanyDesk "+myCompanyDesk);
		System.out.println("Accessible to all " +Food_court);
	}
}
class MainDemo{
	public static void main(String[] args){
		Office obj1=new Office();
		Office obj2=new Office();

		obj1.officeinfo();
		obj2.officeinfo();

		obj2.mylaptopid=102;
		obj2.myCompanyDesk="Tanmay Desk";
		obj2.Food_court="Dinner";
                System.out.println("--------------------------------------");
	

		obj1.officeinfo();
		obj2.officeinfo();

	}
}

	
