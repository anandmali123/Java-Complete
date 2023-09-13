class demo{
	public static void main(String[] args){
		int n=4;
		int num=1;
		for(int i=0;i<n;i++){
			int num1=num;
			for(int j=0;j<n-i;j++){
				System.out.print(num++ +" ");
			}
			num=num1+1;
			System.out.println();
		}
	}
}
