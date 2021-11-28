package javaMain;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
class logss{
	String[] s= {"i","m","o"};
	String type;
	Date d=new Date();
	String  phno;
	String DATE;
	Random r=new Random();
	public void CreateLog() {
		
		type=s[r.nextInt(3)];
		phno=("89043"+(10000+r.nextInt(9999)));
		DATE=d.toString();
	}
	public String toString() {
		return String.format("%s\t%s\t%s", type,phno,DATE);
	}
}

public class Logs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<logss> l=new Stack<logss>();
		Scanner sc=new Scanner (System.in);
		while(true) {
		System.out.println("1.add log");
		System.out.println("2.display recent log"+"the logs present:"+l.size());
		System.out.println("3.display and clear all logs");
		System.out.println("4.exit");
	
		
		int ch=Integer.parseInt(sc.next());
		if(ch==1) {
			
			logss lg=new logss();
			lg.CreateLog();
			l.push(lg);
		}
		else if(ch==2) {
			logss recent=l.peek();
			System.out.println(recent);             //object is being invoked ,so toString function will be called
		}
		else if(ch==3) {
			while(!l.isEmpty()) {
				System.out.println(l.pop());
			}
		}
		else if(ch==4)
			break;
	}

}}
