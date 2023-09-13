class staticblock{
	static {
		System.out.println("in static block 1");
	}
	public static void main(String[] args){
	}
}
class Client extends staticblock{	static{
		System.out.println("In client class static block");
	}
       }

