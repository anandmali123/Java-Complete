class StaticBlock{
	static {
		int x=10;
		System.out.println("Hello I am anand i am in a static block");
	}
	public static void main(String[] args){
		System.out.println("I am in SOP of println");
	}
	static {
		System.out.println("hi i am in a static block 2");
		int y=1;
		   int z=100;
`
		System.out.println("hello sum of x+y+z= "+z);

	}

	//here static block print first and then main method 
	//in method library when there is static block is then its froam push into the firstly before running the other static function . main is static function but it special function but whole content in static block if firstly push to the java stack . 
	//method area is a set up means it is a network and this set up gets value when it pushes into the java stack 
	//when any method referencing through class name then it is static method 
	 //before main method comes in java stack there is already static block comes and all the static values was initialize. 
	//}
}

