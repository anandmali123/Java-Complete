class Demo{
	public static void main(String[] args){
                //all numbers factorial + = that number 
		int n=145;
		int temp1=n;int sum=0;int ans=0;
		while(n!=0){
			
			int rem=n%10;int mult=1;
			while(rem!=0){
				mult=mult*rem;
				rem--;
			}
			ans=mult+ans;
			System.out.println(ans);
			n=n/10;
		}
		System.out.println(ans);
		if(temp1==ans)
			System.out.println("Strong number ");
		else
			System.out.println("Not Strong");
	}
}
