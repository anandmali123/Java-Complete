
class Demo{
	public static void main(String[] args)throws IOException{
		int arr[] =new int[4];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<4;i++){
	                arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<4;i++){
			System.out.println(arr[i]);
		}
	}
}
	
