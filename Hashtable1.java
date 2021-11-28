package javaMain;

import java.util.Hashtable;
import java.util.Scanner;

public class Hashtable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
Hashtable<String,String> h=new Hashtable<String,String>();
h.put("a", "mysore");
h.put("b","ballari");
h.put("c","banglore");
System.out.println("Enetr the key");
String k=sc.nextLine();
if(h.containsKey(k));
System.out.println(h.get(k));
	}

}
