package javaMain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
class withfileslog{
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
	public void LoadToStack(String record) {
		String vals[]=record.split("\t");
		type=vals[0];
		phno=vals[1];
		DATE=vals[2];
	}
	public String toString() {
		return String.format("%s\t%s\t%s", type,phno,DATE);
	}
}

public class LogsWithFiles{
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Stack<withfileslog> l=new Stack<withfileslog>();
		
		try {
			BufferedReader b=new BufferedReader(new FileReader("logsWithFilesp.txt"));
			String record;
			while((record=b.readLine())!=null) {
				withfileslog w=new withfileslog();
				w.LoadToStack(record);
				l.push(w);
			}
			b.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("move forward and selct an operation");
			System.out.println(e.fillInStackTrace());
		}
		
		
		Scanner sc=new Scanner (System.in);
		while(true) {
		System.out.println("1.add log");
		System.out.println("2.display recent log"+"the logs present:"+l.size());
		System.out.println("3.display and clear all logs");
		System.out.println("4.exit");
	
		
		int ch=Integer.parseInt(sc.next());
		if(ch==1) {
			
			withfileslog lg=new withfileslog();
			lg.CreateLog();
			l.push(lg);
		}
		else if(ch==2) {
			withfileslog recent=l.peek();
			System.out.println(recent);             //object is being invoked ,so toString function will be called
		}
		else if(ch==3) {
			while(!l.isEmpty()) {
				System.out.println(l.pop());
			}
		}
		else if(ch==4) {
			try {
		Stack<withfileslog> temp=new Stack<withfileslog>();
		while(!l.isEmpty()) {
			temp.push(l.pop());
		}
		
			PrintWriter p=new PrintWriter(new FileWriter("logsWithFiles.txt"));
			while(!temp.isEmpty()) {
				p.println(temp.pop());
			}
			p.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			break;
		}
			//sc.close();
	}

}}



