class Mahanagarpalika{
	Mahanagarpalika(){
		System.out.println("mahanagarpaolika this = "+ this);
		System.out.println("Mahanagarpalika include 15 nagarparishad");
	}
	void watersection(){
		System.out.println("here all water services will provide");
	}
}
class Nagarpalika extends Mahanagarpalika{
	Nagarpalika(){
		System.out.println("nagarpalika this address = "+this);
		System.out.println("There is nagarpalika for every taluka ");
	}

	void nagarpalikaService(){
		System.out.println("WaterDepartment, Cleaning, FireDepartment, Official");
	}
}
class GramPanchyayat extends Nagarpalika{
	GramPanchyayat(){
		System.out.println("every village havig population more than 700 have own Grampancyat");
	}
	void GrampanchyatSevice(){
		System.out.println("Water provides , cleaning village, arogyavibhag");
	}
}
class User{
	public static void main(String[] args){
//		System.out.print("Parent object calls ");
		Mahanagarpalika obj1=new Mahanagarpalika();
//		System.out.println("child object calls ");
		Nagarpalika obj2=new Nagarpalika();
		Mahanagarpalika obj3=new Nagarpalika();

	}
}

