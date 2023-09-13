import java.util.concurrent;
import java.util.*;
class Producer implements Runnable{
	BlockingQueue bq=null;
	Producer(BlockingQueue bQueue){
		this.BQueue=bQueue;
	}
	public void run(){
		for(int i=0;i<=10;i++){
			try{
				bQueue.put(i);
				System.out.println("Producer "+i);
			}
		catch(InterruptedException ie){
		}
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){
		}
		}
	}
}
class consumer implements Runnable{
	BlockingQueue bQueue=null;
	consumer(BlockingQueue bQueue){
		this.bQueue=bQueue;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			try{
				bQueue.take();
				System.out.println("Consumer "+i);
			}
		catch(InterruptedException ie){
		}
		try{
			Thread.sleep(7000);
		}catch(InterruptedException ie){
		}
		}
	}
}
class PC{
	public static void main(String[] args){
		BlockingQueue bQueue=new ArrayBlockingQueue(3);
		Producer produce=new P
