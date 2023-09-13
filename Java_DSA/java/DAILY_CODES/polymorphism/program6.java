class Match{
	void MatchType(){
		System.out.println("T20-20/ODI/Test");
	}
}
class IPL extends Match{
	void MatchType(){
		System.out.println("T20-20");
	}
}
class Test extends Match{
	void MatchType(){
		System.out.println("Test");
	}
}
class Client{
	 public static void main(String[] args){
		 Match obj=new IPL();
		 obj.MatchType();

		 Test obj1=new Match();
		 obj1.MatchType();
	 }
}

