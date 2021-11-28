package javaMain;

import java.util.Scanner;
/*class NumNeg extends 
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    
  public long power(int a,int b){
      System.out.println()
  }
    
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}*/

class calci{
	public long power(int d,int f) throws neg {
		if(d<0||f<0) {
			throw  new neg();
		}
		return (long)Math.pow(d,f);
	}

}


class neg extends Exception{
	
}
public class Solution{
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("hey");
		int a=sc.nextInt();
		int b=sc.nextInt();
		calci c=new calci();
		
		try {
			System.out.println(c.power(a,b));
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}