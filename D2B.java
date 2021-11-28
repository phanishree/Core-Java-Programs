package javaMain;

import java.util.Scanner;
import java.util.Stack;

public class D2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int decimal=sc.nextInt();
Stack<Integer> s=new Stack<Integer>(); 
while(decimal!=0) {
	int rem=decimal%2;
	s.push(rem);
	decimal=decimal/2;
	
}
while(!s.isEmpty()) {
	System.out.print(s.pop());
}
	}

}
