package javaMain;

import java.util.Comparator;
import java.util.List;

class geniric implements Comparator{
	String name;
	String artist;
	public geniric(String n,String a) {
		name=n;
		artist=a;
	}
	public int compare(geniric h,geniric g) {
		return (h.name.compareTo(g.name));
	}
	//@Override
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
public class Genirics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         geniric g[] = null;
         g[1]=new geniric("August","Taylor");
         g[2]=new geniric("Rachu classic","Rachita");
         g[3]=new geniric("tadada","Adhu");
         
	}

}
