class Parent{
	Parent(){  //Parent(Parent this)
		System.out.println("Parent this addres is "+this);
		System.out.println("In parent Constructor");
	}
	void parentproperty(){
		System.out.println("flat, car,, Gold");
	}
}
class Child extends Parent{//
	Child(){//Child(Child this)
		System.out.println("Child this address is "+this);
		System.out.println("In Child constructor");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj1=new Parent();
		Child obj2=new Child();  //==>Child(obj2)==> Child(Child this);
	       System.out.println("obj2 address is = "+obj2);
		obj2.parentproperty();//parentproperty(obj2)
	}
}

