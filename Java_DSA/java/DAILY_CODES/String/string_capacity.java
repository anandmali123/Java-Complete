class string_buffer_capacity{
	public static void main(String[] args){
		StringBuffer br=new StringBuffer("Anand");
//		br.append(" mali");
		System.out.println(br.capacity());
		br.append(" mali");
		System.out.println(br.capacity());
		br.append(" is ");
		System.out.println(br.capacity());
		br.append(" an IT");
		System.out.println(br.capacity());
		br.append(" Engineer");
		System.out.println(br.capacity());
		br.append("  now there is a time to learn java ");
		System.out.println(br.capacity());
		br.append(" hello dosto today;s topic is String Buffer ");
		System.out.println(br.capacity());
		br.append(" actually there is a one problem that there is bigger size");
		System.out.println(br.capacity());
		br.append(" hello string buffer have a specific size it fills until it no tfull completely and if fill complete;y then makes a new object and increase its size and again for for new size it generates.");
		System.out.println(br.capacity());

	}
}

