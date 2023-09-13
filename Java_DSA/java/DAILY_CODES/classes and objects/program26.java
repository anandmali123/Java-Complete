// ***private variables, method hides in bytecode
class PrivateHide{
	private int x=20;
	PrivateHide(){
		System.out.println(x);
	}
	PrivateHide(int x){
		System.out.println("In parametrized constructor");
	}
	public static void main(String[] args){
	    PrivateHide obj=new PrivateHide();
	   }
}

