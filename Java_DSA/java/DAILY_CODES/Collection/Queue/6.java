import java.util.concurrent.*;
import java.util.*;

class BQDemo{
	public static void main(String[] args)throws InterruptedException{
		BlockingQueue bQueue=new ArrayBlockingQueue(3);
		bQueue.put(10);
		bQueue.put(29);
		bQueue.put(30);
		System.out.println(bQueue);
		bQueue.offer(40,5,TimeUnit.SECONDS);;
	       System.out.println(bQueue);
	       bQueue.take();
	       System.out.println(bQueue);
	       ArrayList al=new ArrayList();
	       System.out.println("ArrayList: "+al);
	       bQueue.drainTo(al);
	       System.out.println("ArrayList: "+al);
	       System.out.println(bQueue);
	}
}

