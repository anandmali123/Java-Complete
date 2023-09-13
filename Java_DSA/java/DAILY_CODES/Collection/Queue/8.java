import java.util.concurrent.*;
import java.util.*;

class BQDemo{
	public static void main(String[] args)throws InterruptedException{
		BlockingQueue bq=new LinkedBlockingQueue(8);
		bq.offer(10);
		bq.offer(20);
		bq.offer(30);
		System.out.println(bq);
		bq.offer(40,5,TimeUnit.SECONDS);
	bq.offer(40);
	System.out.println(bq);
                bq.take();
	       System.out.println(bq);
		ArrayList al=new ArrayList();
		al.add(50);
		bq.drainTo(al);
		System.out.println("ArrayList: "+al);

		System.out.println(bq);
	}
}

