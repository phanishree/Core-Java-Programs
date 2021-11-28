class taylor implements Runnable{
	Thread th;
	 MTSynchro1 n;
	public taylor( MTSynchro1 m){
		th=new Thread(this,"Taylor");  ///this is important
		th.start();
		n=m;
	}
	
	int i=5;
	synchronized public void run() {
		while(i>0) {
			i--;
			System.out.println("Taylor Swift");
			notify();
			n.t=true;
		
			if(n.t)
			try {
				wait();
			}catch(Exception e) { }
		}
	}
}
class ari implements Runnable{
	Thread th;
	 MTSynchro1 n;
	ari( MTSynchro1 m){
		th=new Thread(this,"Ari");
		th.start();
		n=m;
	}
	int i=5;
	synchronized public void run() {
	while(i>0) {
		i--;
		System.out.println("Ariana Grande");
		notify();
		n.t=false;
		
		if(!n.t)
			try {
				wait();
			}catch(Exception g) { }
	}
	}
}
public class MTSynchro1 {
public	boolean t=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MTSynchro1 m=new  MTSynchro1();
taylor a=new taylor(m);
ari b=new ari(m);
System.out.println("hey");

	}

}
