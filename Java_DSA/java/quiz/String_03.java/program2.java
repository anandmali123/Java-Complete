class Dmeo{
	public static void main(String[] args){
		StringBuffer st1=new StringBuffer("Demo");
		StringBuffer st2=new StringBuffer();
		st2=st2.append("Demo");
		System.out.println(st1.capacity()==st2.capacity());
	}
}

