//  real time example of overloading 
class IPL{
	void matchinfo(String team1,String team2){
		System.out.println(team1 + " vs "+team2);
	}
    static 	void matchinfo(String team1, String team2, String Venue){
		System.out.println(team1 + " vs "+team2+","+Venue);
	}
}
class Client{
	public static void main(String[] args){
		IPL obj=new IPL();
		IPL.matchinfo("CSK","GT","OVAL");
		obj.matchinfo("RCB","LSG","Eaden");
		obj.matchinfo("CSK","RCB");
	}
}

