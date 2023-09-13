class demo{
	public static void main(String[] args){
		int n=4;
		int cnt=1;
		int num=1;
		for(int  i=0;i<n;i++){
			int num1=num;
			for(int j=0;j<=i;j++){
				if(cnt%2==0)
					System.out.print(num*num*num+" ");
				else
					System.out.print(num*num+" ");
				cnt++;
				num++;
			}
			num=num1;
			num++;
			System.out.println();
		}
	}
}


