class Anand extends Thread{
	public void run(){
		System.out.println("In run-Anand");
	        setName("Anand Bijlani");
	
		System.out.println("Current Thread Name "+ Thread.currentThread().getName());
		System.out.println("All Thread info: name,priority,threadgrp: "+Thread.currentThread());
	}
}

class Demo{
	public static void main(String[] args){
		Anand obj=new Anand();
	       obj.start();
	       obj.yield();
	       Anand obj1=new Anand();
	       obj1.start();
	       System.out.println("In main");
	     //  obj1.yield();
	}
}

