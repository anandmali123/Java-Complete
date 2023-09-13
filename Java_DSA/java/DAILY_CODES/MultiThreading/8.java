class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());//Thread[thread-0,5,main)
	}

}
class ThreadDemo{
	public static void main(String[] args)throws InterruptedException{
		System.out.println(Thread.currentThread());
		MyThread obj=new MyThread();
		obj.start();
		Thread.sleep(100);

		Thread.currentThread().setName("Anand");
		System.out.println(Thread.currentThread());
	}
}

