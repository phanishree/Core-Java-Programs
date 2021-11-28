
public class Multiprogramming1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread t;
        t=Thread.currentThread();    //This currentThread returns ["thread name",priority of the thread,Group of which the thread created]
        //something like Thread[main,5,main] this
        
        System.out.println(t);       
        t.setName("Phani");        //setName is a function in which we can set our own name for a thread
        
        System.out.println(t);
	}

}
