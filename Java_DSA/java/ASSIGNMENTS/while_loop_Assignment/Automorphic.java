class Demo{
	public static void main(String[] ad){
		int n=36;
		int s=n*n;
	        int temp1=n,temp2=s;
		while(temp1!=0){
			int re1=temp1%10;
			int re2=temp2%10;
			if(re1!=re2){
				System.out.println("Not Automorphic");
			break;
			}
			temp1=temp1/10;
			temp2=temp2/10;
		}
		if(temp1==0)
			System.out.println("Automorphic");
	}
}
