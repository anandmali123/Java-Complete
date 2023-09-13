class MyThread extends Thread {
	MyThread(ThreadGroup tg, String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}

class ThreadGroupDemo{
	public static void main(String[] args)throws InterruptedException{
		ThreadGroup pthreadGP =new ThreadGroup("India");

		MyThread t1=new MyThread(pthreadGP,"Maha");
		MyThread t2=new MyThread(pthreadGP,"Goa");

		t1.start();
		t2.start();

		ThreadGroup cThreadGP=new ThreadGroup(pthreadGP,"Pakistan");
	          
		MyThread t3=new MyThread(cThreadGP, "Karachi");
		MyThread t4=new MyThread(cThreadGP,"Lahore");

		t3.start();
		t4.start();

		ThreadGroup cThreadGP2=new ThreadGroup(cThreadGP,"Bangladesh");

		MyThread t5=new MyThread(cThreadGP2,"Dhaka");
		MyThread t6=new MyThread(cThreadGP2,"mirpur");

		t5.start();
		t6.start();

		cThreadGP.interrupt();
		System.out.println(pthreadGP.activeCount());
		System.out.println(pthreadGP.activeGroupCount());
	        Thread.sleep(100000);
	}
}


