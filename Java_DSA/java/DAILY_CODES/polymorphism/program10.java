//equal method in object class check address of the object and equal method in string checks the content of a string 

class Demo{
	public static void main(String[] args){
	Demo obj1=new Demo();
	Demo obj2=new Demo();
	System.out.println(obj1.equals(obj2));

	String s1="Anand";
	String s2="Shivani";

	System.out.println(s1.equals(s2));
}
}
