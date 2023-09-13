static class Parent{
	void carreer(){
		System.out.println("Doctor");
	}
	void marry();
	
}
class child extends Parent{
	void marry(){
		System.out.println("Shradha");
}
}
class Client{
	public static void main(String[] args){
		Parent obj=new child();
	}
}

