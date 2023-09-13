class Demo{
	public static void main(String[] args){
		//fibonacci series 
		int a=0,b=1,c=a+b;
		for(int i=1;i<9;i++){
			System.out.println(a);
			a=b;
			b=c;
			c=a+b;

		}

	}
}

