class Outer{
	void m1(){
	//	void m2(){
			class Inner{
			}
		
	}
	void m2(){
		class Inner1{
		}
	}

}
class CLient{
	public static void main(String[] args){
		Outer obj=new Outer();
		obj.m1();
		obj.m2();
	}
}
;
