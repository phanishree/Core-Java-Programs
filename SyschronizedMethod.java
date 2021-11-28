package javaMain;

class msg{
void call(String mesg) {
System.out.print("["+mesg);
try {
	Thread.sleep(1000);
}
catch(InterruptedException e) { }
System.out.println("]");
}
}
class caller implements Runnable{
	Thread th;
	String msg;
	msg target;
	public caller(msg targ,String s) {
		target=targ;
		msg=s;
		th=new Thread(this);
		th.start();
	}
	public void run() {
		synchronized(target){
		target.call(msg);
	}
}
}
public class SyschronizedMethod {
public static void main(String[] args) {
		// TODO Auto-generated method stub
msg target=new msg();
//msg tri=new msg();
caller ob1=new caller(target,"Hello");
caller ob2=new caller(target,"Sysnchronizied");
caller ob3=new caller(target,"World");
try {
	ob1.th.join();
    ob2.th.join();
	ob3.th.join();
}
catch(InterruptedException e) { }
System.out.println("Taylor Swift");
	}

	
}

