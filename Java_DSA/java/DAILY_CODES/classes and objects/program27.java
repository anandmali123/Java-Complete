////*********************       this method cha use karun apan private variables access karu shakto ////


class player{
	private int jerNo=0;
	private String name=null;

	player(int jerNo,String name){
		this.jerNo=jerNo;
		this.name=name;
		System.out.println("In  constructor");
	}

	void info(){
		System.out.println(jerNo + " = "+name);
	}
}
class Client{
	public static void main(String[] args){
		player obj=new player(18,"Virat Kohli");//player(obj,18,"Virat Kohli")
		obj.info();// info(obj)

		player obj1=new player(7,"MSD");//player(player this,7,"MSD");

		obj1.info();//info(obj1)

		player obj3=new player(45,"Rohit");//player(player this,45,"Rohit")
                  obj3.info();
	}
}



