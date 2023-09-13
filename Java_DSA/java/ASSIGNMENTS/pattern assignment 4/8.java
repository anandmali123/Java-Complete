class demo{
	public static void main(String[] args){
		int num=10;
		char s='J';
		int n=4;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				if(i%2==0){
					System.out.print(num +" ");
				}
				else{
					System.out.print(s+" ");
				}
				num--;
				s--;
			}
			System.out.println();
		}
	}
}
