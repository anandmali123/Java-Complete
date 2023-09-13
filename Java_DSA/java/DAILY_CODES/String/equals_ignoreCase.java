class equal_ignore_case{
	public static boolean equalignore(String s,String p){
		
		char[] s1=s.toCharArray();
		char[] p1=p.toCharArray();
		if(s1.length !=p1.length){
			return false;}
		//	System.out.println(-1);
		for(int i=0;i<s.length();i++){
			if((p1[i]>=97 && p1[i]<=122)){
				p1[i]-=32;}
				
			if(s1[i]>=97 && s1[i]<=122){
			s1[i]-=32;
			}
		}
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s1[i]==p1[i])
				count++;
		}
		if(count==s.length())
			return true;
	return false;	
	 }
	 public static void main(String[] args){
             String s="Dixit";
             String p="dixiT";
             System.out.println("output by self made method : "+equalignore(s,p));
             System.out.println("output by predefine method : "+s.equalsIgnoreCase(p));
             }
}


