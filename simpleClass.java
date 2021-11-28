package javaMain;


class Airtel
{
	private int curr;
	public boolean IsActive;
	public void activate()
	{
		curr = 10;
		IsActive=true;
	}
	public void recharge( int val )
	{
		if(IsActive)
		curr = curr + val;
		else
			System.out.println("sim not yetactivated,please activae to recharge");
		
	}
	
	public void printBalance()
	{
		if(IsActive)
		System.out.println("Currency value = " + curr );
		else
			System.out.println("sim not yet activated,activate to check the balance");
	}
}

public class simpleClass {

	public static void main(String[] args) {
		
		Airtel sim1 = new Airtel( );
	    Airtel sim2 = new Airtel( );
	    
	   sim1.activate();
	   sim2.activate();               //implicit refrecence to the private data member (curr)
	    
	    sim1.recharge(100);
	   sim2.recharge(200);
	    
	    sim1.printBalance();
	    sim2.printBalance();
	   
		 
	}
}
