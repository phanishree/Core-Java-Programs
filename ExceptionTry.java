package javaMain;

import java.util.Scanner;
//class NumberExceedingThousand extends Exception{
	
//}
class  NumberLesserThanFivehundred extends Exception{
	
}

public class ExceptionTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int a[]=new int[10];
		int sum=0;
		sc=new Scanner(System.in);
		System.out.println("enter 10 numbers for addition");
		for(int i=0;i<10;i++) {
		try {                                                    //exception handling keyword try 
			a[i]=Integer.parseInt(sc.nextLine());
			try {                                              //nested try 
			if(a[i]>1000) {
			//	throw new NumberExceedingThousand();            //custom exception 
				throw new Exception();
			}}
			catch(Exception r) {
				System.out.println("please enter integer lesser than 1000,");
				i--;
			}
			
			try {
				if(a[i]>10) {
					throw new NumberLesserThanFivehundred();
				}
			}
			catch(NumberLesserThanFivehundred d) {
				System.out.println("please enter number lesser than 10");
				i--;
			}
		
	/*		finally {                          //finally block ,this gets executed all the time
				System.out.println(",");
			} */
		
				
		
			
	
		}
	catch(NumberFormatException e) {                                    //catches for respective try blocks
			System.out.println("please enter only integers,");                                
			i--;
			
		}
	
		
		}
		
		for(int i=0;i<10;i++) {
			sum+=a[i];
		}
		System.out.println("sum is:"+sum);

	}

}
