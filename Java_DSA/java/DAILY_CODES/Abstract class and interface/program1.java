abstract  class  Parent{
	void carreer(){
		System.out.println("Engineer");
	}
	abstract void marry();
}
class Child extends Parent{
	void marry(){
		System.out.println("In child marrry");
	}
}

