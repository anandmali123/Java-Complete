class demo{
	public static void main(String[] args){
		char s='A';
		int n=4;
		for(int i=0;i<n;i++){
			char s1=s;
			for(int j=0;j<n-i;j++){
				System.out.print(s+++ " ");
			}
			s=s1;
			s++;
			System.out.println();
		}
	}
}


