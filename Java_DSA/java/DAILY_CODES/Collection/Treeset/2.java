import java.util.*;
class Needs implements Comparable{
	String Aim= null;
	int m=0;
	Needs(String Aim,int n){
		this.Aim=Aim;
		m=n;
	}
	public int compareTo(Needs obj){
return 1;
}

	public String ToString(){
return Aim;
}
}
class TreeSetDemo{
	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();

		ts.add(new Needs("Hardwork",1));
		ts.add(new Needs("Patience",1));
		ts.add(new Needs("Smart work",55));

		System.out.println(ts);
	}
}


