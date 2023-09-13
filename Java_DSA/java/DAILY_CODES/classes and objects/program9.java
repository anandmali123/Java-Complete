class MacD{
	int noofitems=5;
	String product="fries";
	void menu(){
		String menu1="vej";
		String menu2="non-vej";
		System.out.println(noofitems);
		System.out.println(product);

	}
}
class Food{
	public static void main(String[] args){
		MacD br=new MacD();
		br.menu();
	}
}

