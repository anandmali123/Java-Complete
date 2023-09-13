import java.io.*;
class demo{
 
	public static void main(String[] args)throws IOException{
	       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       int arr[][]={{10,20,30},{40,50},{60}};
	//	for(int i=0;i<3;i++){
	//		for(int j=0;j<4;j++){
	//			arr[i][j]=Integer.parseInt(br.readLine());
	//		}
		
		
	//	}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

