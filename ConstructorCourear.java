package javaMain;

import java.util.Scanner;

class Courier
{
	private String sender , recv , city;
	private boolean status = true;
	
	private static int blr , delhi , mumbai;
	
	public Courier( )
	{
		System.out.println("Thank u for using our services !!");
	}
	
	public void FillDetails()
	{
		System.out.println("Enter sender , recv ,city ?");
		Scanner key = new Scanner( System.in );
		sender = key.nextLine();
		recv = key.nextLine();
		city = key.nextLine();
		if( city.equalsIgnoreCase("bangalore"))
			blr++;
		else if( city.equalsIgnoreCase("delhi"))
			delhi++;
		else if( city.equalsIgnoreCase("mumbai"))
			mumbai++;
		else
		{
			System.out.println("Sorry , we can't deliver parcel !!!");
			status = false;
		}
	}
	
	public void PrintMyParcelDetails()
	{
		if( status == false)
			System.out.println("Sorry ,we can't deliver parcel !!");
		else
		{
			System.out.println("------------------------------------");
			System.out.println("Sender   : " + sender);
			System.out.println("Rece     : " + recv);
			System.out.println("City     : " + city);
			System.out.println("------------------------------------");
		}
	}
	
	public static void Summary()
	{
		System.out.println("------------------------------------");
		System.out.println("Bangalore          :" + blr);
		System.out.println("Delhi              :"+ delhi);
		System.out.println("Mumbai             :"+ mumbai);
		System.out.println("------------------------------------");
	}
}


public class ConstructorCourear {

	public static void main(String[] args) {

		Courier p[ ] = new Courier[ 3];
		for( int i=0; i<p.length; i++)
		{
			p[i] =new Courier();
			p[i].FillDetails();
		}

		System.out.println("Parcel tracking as follows");
		for( int i=0; i<p.length;i++)
			p[i].PrintMyParcelDetails();
		
		
		Courier.Summary();
		
	}
}

