











interface Anand{
	int name(int n);
}


interface Core2web{
	void lang();
}
class Year2022{
	public static void main(String[] args){
		Core2web c2w=new Core2web(){
		//	System.out.println("Anand Dnyaneshwar Mali");
			public void lang(){
				System.out.println("In Annonymmous inner class");
		}
		};
		c2w.lang();
		Anand c2w1=(xg)->0;
		
                System.out.println(c2w1.name(0));
	}

}

