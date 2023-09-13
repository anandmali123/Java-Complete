class Demo{
	public static void main(String[] args){
	for(int i=1;i<=6;i++){
		char s=70;
		int p=5;
		for(int j=1;j<=6;j++){
			if(j%2!=0){
             System.out.print(s+" ");
	     s--;
	     s--;}
			else{
				System.out.print(p +" ");
				p=p-2;
			
			}
		}
		System.out.println();
	}
}
}


