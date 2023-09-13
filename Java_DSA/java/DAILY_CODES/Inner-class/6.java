class Injection{
	void marry(){
		System.out.println("Kriti Sanon");
	}
}

class Client{
	public static void main(String[] args){
		Injection obj=new Injection(){

			void language(){
				System.out.println("Ye bula yendila one seconda");}
			void marry(){
			language();
				System.out.println("Disha Patani");
			}
			

			
		};
	       obj.marry();

	}
}

