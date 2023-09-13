//creating a child class using runnable interface
class MyThread implements Runnable{
	public void run(){
		System.out.println("In Run");
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadDemo{

	public static void main(String[] args)throws InterruptedException{
		MyThread obj=new MyThread();
		Thread t=new Thread(obj);
		t.start();
		t.sleep(1000,-2);
		System.out.println(Thread.currentThread().getName());
	}
}

