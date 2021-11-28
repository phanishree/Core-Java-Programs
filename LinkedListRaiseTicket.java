package javaMain;

import java.util.LinkedList;
import java.util.Scanner;

class ticket{
	private String issue;
	private String cid;

public void setValue(String issue) {
	this.issue=issue;
	//this.cid=cid;
}
public void setcid(String cid) {
	this.cid=cid;
}
public String toString() {
	return String.format("%s  %s", cid ,issue);
}
public String getcid() {return cid;}

}

public class LinkedListRaiseTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<ticket> l=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("-------------------");
			System.out.println("1.Raise ticket");
			System.out.println("2.Accept ticket by technician");
			System.out.println("3.Display all raised tickets:"+l.size());
			System.out.println("4.Withdraw raised ticket");
			System.out.println("5.Exit");
			System.out.println("-------------------");
			System.out.println("enter thr choice");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("Enter the issue and cid");
				ticket t=new ticket();
				t.setValue(sc.next());
				t.setcid(sc.next());
				l.add(t);
				System.out.println("your ticket has been raised and you are at:"+l.size()+" "+"position");
			}
			else if(ch==2) {
				System.out.println(l.getFirst());
				l.remove();
				
			}
			else if(ch==3) {
				for(int i=0;i<l.size();i++) {
					System.out.println(l.get(i));
					System.out.println("*****");
				}
				
		}
			else if(ch==4) {
				System.out.println("Enetr the cid");
				String CID=sc.next();
				for(int i=0;i<l.size();i++) {
					if(l.get(i).getcid().equals(CID)) {
				System.out.println("your ticket"+" "+l.get(i)+" "+"has been withdrawn");
				l.remove(i);
				break;
					}
			}
		}

			else if(ch==5)
				break;
		}
		
		

	}

}
