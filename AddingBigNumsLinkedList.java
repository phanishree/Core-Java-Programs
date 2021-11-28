package javaMain;

import java.util.LinkedList;
import java.util.Scanner;

public class AddingBigNumsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<>();
		LinkedList<Integer> l2=new LinkedList<>();
		LinkedList<Integer> l3=new LinkedList<>();
		System.out.println("Enter  the 2 numbers to be added");
		Scanner sc=new Scanner(System.in);
		int dummy=sc.nextInt();
		String num1=sc.next();
		int dummy1=sc.nextInt();
		String num2=sc.next();
		for(int i=0;i<num1.length();i++) {
			l1.addFirst(Integer.parseInt(num1.substring(i,i+1)));
		}
		for(int i=0;i<num2.length();i++) {
			l2.addFirst(Integer.parseInt(num2.substring(i,i+1)));
		}
		int carry=0;
		
		
		while(l1.size()!=0 &&l2.size()!=0) {
			int n=l1.getFirst()+l2.getFirst()+carry;
			l3.addFirst(n%10);
			carry=n/10;
			l1.removeFirst();
			l2.removeFirst();
			
			}
		LinkedList<Integer> temp;
		if(l1.size()!=0)
			temp=l1;
		else
			temp=l2;
		
		while(temp.size()!=0) {
			int h=temp.getFirst()+carry;
			l3.addFirst(h%10);
			carry=h/10;
			temp.removeFirst();
			
		}
		
		if( carry != 0 )
			l3.addFirst( carry);
		
		for(int i=0;i<l3.size();i++)
			System.out.print(l3.get(i));

	}

}
