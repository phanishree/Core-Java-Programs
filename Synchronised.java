package javaMain;

import java.io.FileInputStream;

class printer {
	synchronized void print(String filename) {
		System.out.println("printing started from file:"+filename);
		try {
			FileInputStream fp=new FileInputStream(filename);
			int ch;
			do
			{
			ch=fp.read();
			System.out.print((char)ch);
			Thread.sleep(20);
		    }while(ch!=-1);
			fp.close();
	}catch(Exception e) { }
		System.out.println("Printing finished !!");
}
}
class printable implements Runnable{
	static printer gk=new printer();
	Thread th;
	String filename;
	public printable(String filename,int p) {
		this.filename=filename;
		th=new Thread(this);
		th.setPriority(p);
		th.start();
		
	}
	@Override
	public void run() {
		System.out.println("Thread started for filename:"+filename);
		gk.print(filename);
	}
}

public class Synchronised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      printable p1=new printable("C:/Intel/duhh/TryingToCreateNewFile.txt",9);
      printable p2=new printable("C:/Users/Phanishree/Documents/Downloads/arokia java/Calc.java.txt",6);
      printable p3=new printable("C:/Intel/duhh/priority3.txt",8);
	}

}
