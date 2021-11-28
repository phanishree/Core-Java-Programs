package javaMain;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;

class OtherThanNumbersListedAboveException extends Exception {

}
class product{
	private String item,pid,company;
	int quantity;
	Scanner sc=new Scanner(System.in);
	private Exception OtherThanNumbersListedAboveException;
	void Filldetails() {
		String ite[]= {"mobile","headset","laptop","modem","smart watch","harry potter books","hoodie","wall clock","joggers","T-shirts"};
		String pi[]= {"1aa","2bb","3cc","4dd","5ee","6ff","7gg","8ii","9jj","10kk","11ll"};
		int c=0;
		System.out.println("Select the product liste3d below");
		for(int i=0;i<ite.length;i++)
		System.out.println(i+")"+ite[i]);
		
		try {
		 c=sc.nextInt(); 
		 if(c<0||c>ite.length)
			 throw new OtherThanNumbersListedAboveException();
		 else {
			 item=ite[c];
				pid=pi[c];  
				quantity=1;
		 }
		}
		catch(InputMismatchException r) {
			System.out.println("enter integers only !");
		}
		catch(OtherThanNumbersListedAboveException t) {
			System.out.println("enter the integers which are listed in above list !");
		} 
		catch(Exception e) {
			
		}
		
	}
	public String getid() {
		return pid;
	}
	public void updateqty() {
		quantity++;
	}
	public String toString() {
		return String.format("| pid: %s  | item: %s  | qty: %d", pid,item,quantity);
	}
}

public class Hashtable2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Hashtable<String,product> h=new Hashtable<String,product>();
		while(true) {
		System.out.println("1.Add item");
		System.out.println("2.Delete item from cart");
		System.out.println("3.View cart");
		System.out.println("4.Exit");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		try {
		if(ch==1) {
			product p=new product();
			p.Filldetails();
			if(h.containsKey(p.getid())) {
				product cartitem=h.get(p.getid());
				cartitem.updateqty();
				h.remove(p.getid());
				h.put(cartitem.getid(),cartitem);
			}
			else
				h.put(p.getid(),p);
		}}
		catch(Exception r) {}
		if(ch==2) {
			Enumeration<String> e=h.keys();
			int i=1;
			while(e.hasMoreElements()) {
				String key=e.nextElement();
				System.out.println(i+")"+h.get(key));
				i++;
			}
			System.out.println("Enetr the item pid to be removed from cart");
			String pid=sc.next();
			if(h.containsKey(pid)) {
				h.remove(pid);
				System.out.println("The item ha sbeen removed ..!!");
			}
			else
				System.out.println("The product with the entered pid doesnt exit in cart...!!");
		}
		if(ch==3) {
			Enumeration<String> f=h.keys();
			String kry;
			int i=0;
			while(f.hasMoreElements()) {
				kry=f.nextElement();
				System.out.println(i+1+")"+h.get(kry));
				i++;
			}
		}
		if(ch==4) {
			break;
		}

	}

}
}