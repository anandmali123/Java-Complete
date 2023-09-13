import java.util.*;
class Movies implements Comparable{
	String movieName = null;
	float totColl = 0.0f;

	Movies(String movieName , float totColl){
		this.movieName = movieName;
		this.totColl = totColl;
	}
	public int compareTo(Object obj){
		return -(movieName.compareTo(((Movies)obj).movieName));
	}

	public String toString(){
		return movieName;
	}
}
class TreeSetDemo{
	public static void main(String[] args){
		TreeSet ts=new TreeSet();

		ts.add(new Movies("Gadar",340.00f));
		ts.add(new Movies("GJS",350.00f));
		ts.add(new Movies("URI",567.00f));

		System.out.println(ts);
	}
}

