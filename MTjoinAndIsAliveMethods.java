class demo3 implements Runnable{
	Thread th;
	String name;
	public demo3(String ThreadName) {
		name=ThreadName;
		th=new Thread(this,name);
		System.out.println(th);
		th.start();
	}
	
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(name+" "+(i+1));
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("Child thread interrupted");
		}
		System.out.println(name+" completed");
	}
}
public class MTjoinAndIsAliveMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    demo3 a=new	demo3("one");
		demo3 b=new demo3("Two");
        demo3 c=new demo3("Three");
        System.out.println("Thread one is alive?"+a.th.isAlive());
        System.out.println("Thread two is alive?"+b.th.isAlive());
        System.out.println("Thread three is alive?"+c.th.isAlive());
		try {
		//	Thread.sleep(10000);
		      a.th.join();
			b.th.join();
			c.th.join();
			//Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		  System.out.println("Thread one is alive?"+a.th.isAlive());
	        System.out.println("Thread two is alive?"+b.th.isAlive());
	        System.out.println("Thread three is alive?"+c.th.isAlive());
		System.out.println("Main thread completed");

	}

}
