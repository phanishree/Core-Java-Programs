package javaMain;

import java.util.Random;

interface wifii{
	public void connect();
}
class aa implements wifii{
	public void connect() {
		System.out.println("COnnected through wifi 1..!!!");
	}
}
class b implements wifii{
	public void connect() {
		System.out.println("connected through wifi2...!!");
	}
}

public class Interfacee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int s1=r.nextInt(10);
		int s2=r.nextInt(10);
		wifii w;
		if(s1>s2)
			w=new aa();
		else
			w=new b();
		System.out.println(s1+"&"+s2);
		
		Interfacee2 b=new Interfacee2();
		
		b.fb(w);                                     //interface variable as a parameter
		b.insta(w);
		
		

	}
	void fb(wifii e) {
		System.out.println("FB:");
		e.connect();
	}
	void insta(wifii e) {
		System.out.println("INSTA:");
		e.connect();
	}

}
