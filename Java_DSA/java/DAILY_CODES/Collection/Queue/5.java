import java.util.concurrent.*;
import java.util.*;
class BQDEmo{
	public static void main(String[] args){
		BlockingQueue bQueue=new ArrayBlockingQueue(3);
		bQueue.offer(10);
		bQueue.offer(20);
		bQueue.offer(30);
		bQueue.offer(40);
		System.out.println(bQueue);
	}
}

