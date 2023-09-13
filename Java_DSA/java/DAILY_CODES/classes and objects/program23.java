//          ***    In Java,  if we pass constructor with that parameter those contructor calls and only on these constructor instance variables intitalize


class firstcallvariable{
	firstcallvariable(){
              System.out.println("In no argument constructor");
	}
	firstcallvariable(int x){
		System.out.println("In first parameter constructor");
	}
	firstcallvariable(int x,int y){
		System.out.println(x+y);
	}
	int x=10;
	public static void main(String[] args){
		firstcallvariable obj=new firstcallvariable();
	}
}

