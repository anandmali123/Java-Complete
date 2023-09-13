class demo{
	public static void main(String[] args){
		int num=1;
		int n=4;
		for(int i=0;i<n;i++){
			int num1=num;
			for(int j=0;j<=i;j++){
				System.out.print(num+++" ");
			}
			num=num1;
			num++;
			System.out.println();
		}
	}
}

