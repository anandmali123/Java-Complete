class demo{
	public static void main(String[] args){
		char s='F';
		int num=1;
		int n =6;
		for(int i=0;i<n;i++){
			char s1=s;
			for(int j=0;j<=i;j++){
				if(j%2==0){
					System.out.print(s++ +" ");
				}
				else
					System.out.print(num++ + " ");
			}
			s=s1;
			s--;
			System.out.println();
		}
	}
}

