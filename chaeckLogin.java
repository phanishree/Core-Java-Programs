package javaMain;

public class chaeckLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String login ="08:25:34";
int h=Integer.parseInt(login.substring(0,2));
int m=Integer.parseInt(login.substring(3,5));
if(h<10)
	System.out.println("early login");
else if(h>10)
	System.out.println("late login");
else if(h==10&&m==25)
	System.out.println("correct login");
else
	System.out.println("invalid login");

	}

}
