class pri implements Runnable{
	Thread th;
	protected int  count=0;
	private volatile boolean yes=true;           //volatile is used to ensure that the value of boolean "yes" is examined everytime
	public pri(int n) {
		th=new Thread(this);
		th.setPriority(n);
		//th.start();
	}
	
	public void run(){
	while(yes)
		count++;
	}
	public void start() {
		th.start();
	}
	
	public void stop() {
		yes=false;
	}
	
}
public class MTpriorityThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);;
      pri a=new pri(Thread.NORM_PRIORITY+2);
      pri b=new pri(Thread.NORM_PRIORITY-2);
      a.th.start();
      b.th.start();
      try {
    	  Thread.sleep(5000);
      }
      catch(InterruptedException e) {
    	  
      }
      a.stop();
      b.stop();
      
      try {
    	  a.th.join();
    	  b.th.join();
      }
      catch(Exception y) {
    	  
      }
      System.out.println("Low priority "+b.count);
      System.out.println("High priority "+a.count);
	}

}
