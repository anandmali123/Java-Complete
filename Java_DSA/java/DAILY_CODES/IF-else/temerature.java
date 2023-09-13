class Temp{
	public static void main(String[] args){
		float x=3f;
		if(x>98.6f)
			System.out.println("high");
		else if(x>=98.0 && x<=98.6)
			System.out.println("Normal");
		else
			System.out.println("low");
	}
}
