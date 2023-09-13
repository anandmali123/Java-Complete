///// ************ super() and this() we cant write at a time both because in constructor both need to be initialized in first line of code 

class Super{
	int x=20;
	Super(){
		super();
		System.out.println("In no argument constructor");
	}
	Super(int x){
		System.out.println("In parametrized constructor");
	}
         public static void main(String[] args){
		 Super obj=new Super();
	 }
}

