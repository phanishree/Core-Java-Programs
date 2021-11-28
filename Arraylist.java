package javaMain;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> l=new ArrayList<String>();//Strongly typed .if not strongly typed boxing must be done while assigning somrthing to the list
//ArrayList<Integer> r=new ArrayList<Integer>();
//r.add(7);
//r.add(0, r.get(0)+1);
while(true) {
System.out.println("1.login");
System.out.println("2.logout");
System.out.println("3.List users:"+l.size());
System.out.println("4.exit");
int ch;
String name;
Scanner sc=new Scanner(System.in);
ch=Integer.parseInt(sc.next());
if(ch==1) {
	System.out.println("enter the user name");
	name=sc.next();
	l.add(name);

}
else if(ch==2) {
	System.out.println("enter your user name");
	String nam=sc.next();
	if(l.contains(nam)) {
		l.remove(nam);
	}
	else {
		System.out.println("username invalid!!!");
	}
}
else if(ch==3) {
int n=	l.size();
for(int i=0;i<n;i++) {
	
	System.out.println(l.get(i));
}
}
else if(ch==4)
	break;
	}
	}
}
