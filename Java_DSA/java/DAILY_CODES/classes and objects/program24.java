//  ****** object  ekach banvila astana don constructor kashe call karayache ? ==> this() chya madatine apan new constructor call karto 

class Twoconstructorcalls{
	int x=12;
	Twoconstructorcalls(){
		System.out.println("in no argument constructor");
	}
	Twoconstructorcalls(int x){
		this();
		System.out.println("in parametrized constructor");
	}
	public static void main(String[] args){
            Twoconstructorcalls obj= new Twoconstructorcalls(10);
	}
}

