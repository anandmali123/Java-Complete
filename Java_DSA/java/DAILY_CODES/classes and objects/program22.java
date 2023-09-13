/////////////////////Method Signature////////////////////////////
class MethodSignature{
	int x=10;
	MethodSignature(){
		this();
		System.out.println(x);
	}
	MethodSignature(int x,int y){
		
		System.out.println(x);

	}
	public static void main(String[] args){
		MethodSignature obj=new MethodSignature();
	}

}

