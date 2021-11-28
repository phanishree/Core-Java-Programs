package javaMain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class UniqueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> l=new ArrayList<Integer>();
Random r=new Random();
int a;
int b[]= {10,20,30,40};
for(int i=0;l.size()!=10;i++) {
	a=r.nextInt(10);
	if(!l.contains(a)) {
	l.add(a);
	}
}
double n[]= {1.223,7.889,9.66,2.222};
Arrays.sort(n);
System.out.println(Arrays.toString(n));
for(int i=0;i<l.size();i++) {
	System.out.println(l.get(i));
}


	}

}
