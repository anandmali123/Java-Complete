class Demo{
	public static void main(String[] args){
		int p=1;
		char s=65;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=4;j++){
				if(j%2==0)
					System.out.print(p++ +" ");
				else
					System.out.print(s++ +" ");
			}
			System.out.println();

		}
	}}
