class compareto_implementation{
	static int compareto(String s,String r){
		if(s.length()!=r.length())
			 return s.length()-r.length();
		else if(s==r)
			return 0;
		else{
			char[] a=s.toCharArray();
			char[] b=r.toCharArray();
			for(int i=0;i<s.length();i++)
				if(a[i]!=b[i])
					return a[i]-b[i];
		}
		return 0;
	}
	public static void main(String[] ars){
	//	System.out.println("output by self made method "+compareto("Anand","Anandmali"));
	    String s="Anand";
	    String r="xnand";
	    System.out.println("output by self function(_) "+compareto(s,r));
	    System.out.println("Output by compareTO() method "+s.compareTo(r));


	
	}
}

