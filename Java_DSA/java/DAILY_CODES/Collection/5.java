import java.util.LinkedHashSet;
class CricPlayer{
	int jerNo =0;
	String pName =null;

	CricPlayer(int jerNo, String pName){
		this.jerNo =jerNo;
		this.pName=pName;

	}
}

class hashsetDemo{
	public static void main(String[] args){
		LinkedHashSet hs=new LinkedHashSet();
		hs.add(new CricPlayer(18,"Virat"));
		hs.add(new CricPlayer(7,"Ms"));
		hs.add(new CricPlayer(45,"Rohit"));
		hs.add(new CricPlayer(7,"Ms"));
		System.out.println(hs);
	}
}


