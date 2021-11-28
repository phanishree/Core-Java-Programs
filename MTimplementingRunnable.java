class demo implements Runnable{                 //creating a thread by implementing Runnable
	
	demo(){                             //constructor

		Thread th=new Thread(this);   //thread creation
		System.out.println("Child thread "+th);
		th.start();                      //calls the run method
	}
	public void run() {
		try {
			for(int i=50;i>45;i--) {
			//	System.out.println("Child Thread:"+i);
				System.out.println("computer science");
			Thread.sleep(100);                                //this actually throws InterruptedException
		}}
		catch(Exception r) {
			System.out.println("Child thread interrupted");
			
		}
		System.out.println("Child thread completed");
	}
}
public class MTimplementingRunnable {

	public static void main(String[] args) {                      //this is main thread
		// TODO Auto-generated method stub
            new demo();              //instantiating or calling the constructor
System.out.println("hey");
		
		try {
			for(int i=5;i>0;i--) {
			//System.out.println("Main Thread:"+i);
				System.out.println("Information Science");
			Thread.sleep(500);
		}}
		catch(Exception e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("main thread completed");
	}

}
