


//Normal - Inner Class

class Defence{
	String name="Anand";
        

	class Navy{
		void m1(){
			System.out.println("Navy-m1()"+name);
		}
	}
	

	void shedule(){
		class final{
			void m2(){
				System.out.println("final - m2");
			}
		       		}
		final obj=new final();
		obj.shedule();
	}


	void m1(){
		System.out.println("In Defence-m1");
	}
        public static void main(String[] args){
		Defence defence=new Defence();
		Navy obj=defence.new Navy();
		obj.m1();
		obj.shedule();
	}

}

