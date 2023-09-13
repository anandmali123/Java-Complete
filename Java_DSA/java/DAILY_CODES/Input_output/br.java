import java.io.*;
class DEmo{
	public static void main(String[] args)throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a society name: ");
		String name=r.readLine();

		System.out.println("Enter a wing name: ");
		char wing=(char)r.read();
                 r.skip(1);
		System.out.println("Enter a room no. : ");
	int room=(r.readLine());

		System.out.println("Society : "+name);
		System.out.println("wing : "+wing);
		System.out.println("room : "+room);
	}
}


