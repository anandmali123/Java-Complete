class Hostel{
	int MyRack=101;
	static int drinking_water=112233;
	void myexpense(){
		System.out.println("tea");
		System.out.println("sunday dinner");
	}
	static void Mess(){
		System.out.println("Kaveri Hostel Mess - Rohinee");
		System.out.println("purandar Hostel Mess - Annapurna");
	}
}
class User{
	public static void main(String[] args){
            Hostel user1=new Hostel();
	    user1.myexpense();
	    user1.Mess();
	    System.out.println(user1.MyRack);
	    System.out.println(user1.drinking_water);

	}
}


