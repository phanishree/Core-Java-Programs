package javaMain;

class duh implements Runnable{
	
	public duh() {
	Thread t=new Thread(this);
	t.start();
	}
	
	
public	void run() {
	for(int i=0;i<10;i++) {
	System.out.println("Taylor swift");
	try {
	Thread.sleep(500);
	}
	catch(InterruptedException t) { }
}}
}

public class Threading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duh a=new duh();
	/*	try {
			Thread.sleep(500);
		}catch(Exception g) { }*/
		//duh b=new duh();
		
		for(int i=0;i<10;i++) {
			System.out.println("Ariana grande");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException y) { }
		}
		

	}

}
