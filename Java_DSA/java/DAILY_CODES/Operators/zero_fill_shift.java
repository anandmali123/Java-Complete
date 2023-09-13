class Bitwise{
	public static void main(String[] args){
		int x=-10;
		System.out.println("x= "+Integer.toBinaryString(x));
		System.out.println("Right shift - "+Integer.toBinaryString(x>>2));
		System.out.println("Zero Fill Shift of -10 = "+Integer.toBinaryString(x>>>2));

		//when we do Zero fill shift then there is same result as right shift
	}
}
