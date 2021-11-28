package javaMain;

import java.util.Random;

interface wifi
{
	public void connect();
}

class w1 implements wifi
{
	@Override
	public void connect() {
		System.out.println("Connecting to internet using wifi-1");
	}
}

class w2 implements wifi
{
	@Override
	public void connect() {
		System.out.println("Connecting to internet using wifi-2");
	}
}


public class Interfacee1 {

	public static void main(String[] args)   {
		
	 Random rnd = new Random();
	 int s_w1 = rnd.nextInt(100);
	 int s_w2 = rnd.nextInt(100);
	 
	 wifi i;
	 if( s_w1 > s_w2 )
		 i = new w1();
	 else
		 i = new w2();
	 
	 i.connect();
	}
}

