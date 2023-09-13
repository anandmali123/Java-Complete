class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
	void property(){
		System.out.println("Home, Car, Gold");
	}
	void marry(){
		System.out.println("Nargis fakhri");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In Child Constructor");
	}
	void marry(){
		System.out.println("Ananya Pandey");
	}
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.marry();
	}
}

