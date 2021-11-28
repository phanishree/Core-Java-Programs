/*This program creates threads by extending Thread class and Multiple threads are created here(3 threads) */
class demo1 extends Thread{
	String name;
	public demo1(String ThreadName) {             //constructor
		super(ThreadName);
		System.out.println("Child thread "+this);
		name=ThreadName;
		start();
	}
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				//System.out.println(name+":"+(i+1));
				System.out.println(name);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Child thraed interrupted");
		}
		System.out.println(name+" thread completed");
	}
}
public class MTextendingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	/*new	demo1("one");
	new demo1("Two");
	new demo1("Three");*/
		new	demo1("computer science");
		new	demo1("Information Science");
	try {
		Thread.sleep(5000);                //main thread put into sleep untill all other threads complete their task
	}
	catch(InterruptedException e) {
		System.out.println("Main thread interrupted");
	}
	System.out.println("Main thread completed");
	}

}
