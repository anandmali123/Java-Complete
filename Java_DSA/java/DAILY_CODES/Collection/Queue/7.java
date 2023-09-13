import java.util.concurrent.*;
import java.util.*;
class LBQDemo{
	public static void main(String[] args)throws InterruptedException{
		BlockingQueue bq=new LinkedBlockingQueue(3);
		bq.put(10);
		bq.put(20);
		bq.put(30);
		bq.put(40);
		System.out.println(bq);
	}
}

