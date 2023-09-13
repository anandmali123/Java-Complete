class Demo{
	public static void main(String[] args){
		int num=1;
		int n=6;
		for(int i=0;i<n;i++){
			int num1=num;
			for(int j=0;j<=i;j++){
				if(j%2==0){
					System.out.print(num*num*num+ " ");
				}
				else{
					System.out.print(num*num+" ");
				}
                     num++;
			}
			num=num1;
			num++;

			System.out.println();
		}


	}
}
