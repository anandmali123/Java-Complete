class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}

class ThreadGroupDemo{
	public static void main(String[] str){
		ThreadGroup pthreadGP=new ThreadGroup("Core2web");

		MyThread obj1=new MyThread(pthreadGP,"C");
		MyThread obj2=new MyThread(pthreadGP,"Java");
		MyThread obj3=new MyThread(pthreadGP,"Python");

		obj1.start();
		obj2.start();
		obj3.start();

		ThreadGroup cthreadGP=new ThreadGroup(pthreadGP,"incubator");
	        cthreadGP.suspend();
		MyThread obj4=new MyThread(cthreadGP,"Flutter");
		MyThread obj5=new MyThread(cthreadGP,"Reactjs");
		System.out.println("Active COunt in a cthreadGP are: "+cthreadGP.activeGroupCount());
		MyThread obj6=new MyThread(cthreadGP,"Sprintboot");

		obj4.start();
		obj5.start();
		obj6.start();

	}
}

