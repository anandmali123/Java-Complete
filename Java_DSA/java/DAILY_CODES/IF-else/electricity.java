class Electricity{
	public static void main(String[] args){
		int x=241;

		int price;
		if(x<=100)
			price=x*1;
		else
			price=100+(x-100)*2;
		System.out.println(price);
	}
}
