class Stringcapacity{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer(10000000000);
		System.out.println(sb.capacity());
		sb.append("Anand Dnyaneshwar Mali");
		System.out.println(sb.capacity());
		sb.append(" is a IT Engineer ");
		System.out.println(sb.capacity());
		sb.append(" he is a one the next Billionaire in the world");
		System.out.println(sb.capacity());
	}
}

