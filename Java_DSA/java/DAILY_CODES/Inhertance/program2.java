 class program2{
	 program2(){
		System.out.println("Parent1");
	}
}
class Parent2{
	Parent2(){
		System.out.println("Parent2");
	}
}
class Child extends Parent2,program2{
	Child(){
	}
}
//in Java, multiple inheritance not allowed, becaue when we call class as multiple inheritanc e ther when there is same methods or variables in both parent classes then after making object of child there is hvm confusn from where it goes from parent1 or parent2 so to remove this ambiguity there is no mulitple inheritance 

