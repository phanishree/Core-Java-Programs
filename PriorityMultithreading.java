package javaMain;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class priority implements Runnable{
	String filename;
	int plevel;
	Thread th;
	boolean flag=true;
	public priority(String filename,int pio) {
		this.filename=filename;
		plevel=pio;
		th=new Thread(this);
		th.setPriority(plevel);
		th.start();
	}
	public void run() {
		try {
		FileOutputStream f=new FileOutputStream(filename);
		while(flag) {
			f.write('@');
			Thread.sleep(50);
		}f.close();
		}catch(Exception g) { }
	}
	public void stopWriting(){
		flag=false;
	}
}
public class PriorityMultithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        priority p=new priority("c:/Intel/duhh/priority9.txt",9);
        priority q=new priority("c:/Intel/duhh/priority3.txt",3);
        System.out.println("hello phani");
        
     //   FileCreator f=new FileCreator("c:/Intel/duhh/priority9");
        
        	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
        	p.stopWriting();
        	q.stopWriting();
		
	}

}
