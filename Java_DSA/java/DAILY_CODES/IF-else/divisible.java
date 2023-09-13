class Divisible{
	public static void main(String[] args){
		int x=3;
		if(x%3==0 && x%5==0)
			System.out.println("fizz-buzz");
		else if(x%3==0)
			System.out.println("Fizz");
		else if(x%5==0)
			System.out.println("buzz");
		else
			System.out.println("Npot divible by both");
	}
}
