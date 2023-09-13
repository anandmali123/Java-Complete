class insertDemo{
	static  char[] insertmy(int i,String s,String s1){
		char[] arr=s.toCharArray();
		char arr1[]=s1.toCharArray();
		String sb="";
		sb=sb.copyValueOf(arr,i,s1.length());
	        String sl="";
		int c=0;
		for(int p=i;p<s1.length();i++){
			arr[i]=arr1[c];
			c++;
		}
		String sm="";
		for(int j=0;j<arr.length;j++){
			sm+=arr[j];
		}
		sm=sm.concat(sb);
		char[] ans=sm.toCharArray();
		return ans;
	}
	public static void main(String[] args){
		String s="core2web Technology";
		String b="Biencaps";
		char[] a=insertmy(3,s,b);
		System.out.println(a);
	}



}

		
