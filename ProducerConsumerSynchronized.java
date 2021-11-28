package javaMain;

class Q{
	int n;
	boolean valueset=false;
	
	synchronized void get() {
		while(!valueset)
			try {
				wait();
			}catch(InterruptedException e) { }
		System.out.println("Got: "+n);
		valueset=false;
		notify();
	//	return n;
		
	}
	
	synchronized void put(int n) {
		while(valueset)
			try {
				wait();
			}catch(InterruptedException e) { }
		System.out.println("Put: "+n);
		valueset=true;
		this.n=n;
		notify();
	}
}

class producer implements Runnable{
	Q q;
	Thread th;
	int v;
	producer(Q q){
		this.q=q;
		 th=new Thread(this,"Producer");
		th.start();
	}
	public void run() {
		int i=0;
		while(v<5) {
			v++;
			q.put(i++);
	}
}
}
class consumer implements Runnable{
	Q q;
	Thread th;
	int u;
	consumer(Q q){
		this.q=q;
	 th=new Thread(this,"Consumer");
		th.start();
	}
	public void run() {
		while(u<5) {
			u++;
			q.get();	
	}
	}
}

public class ProducerConsumerSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Q q=new Q();
producer o=new producer(q);
consumer l=new consumer(q);
try {
	o.th.join();
	l.th.join();
	
}catch(InterruptedException e) { }
System.out.println("Taylor Swift");
System.out.println("Press cntl+c to stop");
	}

}
