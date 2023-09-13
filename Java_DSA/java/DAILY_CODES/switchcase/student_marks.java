import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter DSBDA marks- ");
				int dsbda=Integer.parseInt(br.readLine());
				System.out.println("Enter CNS marks- ");
				int cns=Integer.parseInt(br.readLine());
					System.out.println("Enter CC marks ");
					int cc=Integer.parseInt(br.readLine());
						System.out.println("Enter WAD marks ");
						int wad=Integer.parseInt(br.readLine());
							int sum=cc+wad+dsbda+cns;
					/*		switch(sum){
								case 80:
									System.out.println("A");
									break;
								case 60:
									System.out.println("B");
									break;
								case 35:
									System.out.println("C");
									break;
								default:
									System.out.println("fail");
								0	break;*/
							int p=1;
							if(sum>350){
								switch(p){
									case 1:
										System.out.println("A");
										break;
							}
							}
							else if(sum>300){
								switch(p){
									case 1:
										System.out.println("B");
										break;
								}
							}
							else if(sum>200)
								switch(p){
									case 1:
										System.out.println("C");
										break;
								}
					                 else{
								 switch(p){
									 case 1:
										 System.out.println("fail");
										 break;
								 }
							 }
					}
	}


