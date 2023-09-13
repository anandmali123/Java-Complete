//method local inner class
class PlanA{
           void placement(){
		   class DSA{
			   void Strong(){
				   System.out.println("Strong-DSA");
			   }
		   }
		   DSA obj=new DSA();
		   obj.Strong();
	   }
}
class Anand{
	public static void main(String[] args){
		PlanA obj=new PlanA();
		obj.placement();
	}
}


