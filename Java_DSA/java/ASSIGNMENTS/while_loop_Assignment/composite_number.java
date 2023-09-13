class Demo{
	public static void main(String[] args){
		int n=34;
		if(n==1)
			System.out.println(n);
	        int count=0;
		for(int i=2;i<=n;i++){
			if(n%i==0)
				count++;
		}
		System.out.println(count);
		if(count>2)
			System.out.println("composite number ");
	}
}
