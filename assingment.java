package javaMain;

import java.util.Scanner;

class PmCares{
	private String name,TransMode;
	private int amount;
	static int total,upi,INTERNET,DEBIT;               //STATIC DATA MEMBERS
	public void FillDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name,amount and the mode of transaction");
		name=sc.nextLine();
		amount=Integer.parseInt(sc.nextLine());
		total+=amount;
		TransMode=sc.nextLine();
		if(TransMode.equalsIgnoreCase("upi"))
			upi++;
		else if(TransMode.equalsIgnoreCase("internet"))
			INTERNET++;
		else
			DEBIT++;
	}	
	static String GetMode(){                      //STATIC MEMBER FUNCTION 
	
	if(upi>INTERNET&&upi>DEBIT)
		return "upi";
	else if(INTERNET>upi&&INTERNET>DEBIT)
		return "internet";
	else
		return "debit";
		
	}
	public String GetName() {                      //ACCESSOR:which returns the private member of a class
		return name;
	}
	public int GetAmount() {                       //ACCESSOR
		return amount;
	}
	public String GetTransMode() {                     //ACCESSOR
		return TransMode;
	}
	static int GetTotalFund() {
		                                 //cannot use non static members also in a static method
		return total;                                       //STATIC MEMBER FUNCTION RETURNING STATIC DATA MEMBER 
	}                                                     //Static functions can only return Static members 
}

public class assingment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PmCares p[]=new PmCares[3];                               //ARRAY OF OBJECTS .DEFINING

for(int i=0;i<p.length;i++) {                                  
	p[i]=new PmCares();                                    //INSTANTIATION
	p[i].FillDetails();
}
for(int i=0;i<p.length;i++) {
	
	System.out.println("-------------------");
	System.out.println("NAME:"+p[i].GetName()+","+"AMOUNt:"+p[i].GetAmount()+","+"TRANSACTION MODE:"+p[i].GetTransMode()+"\n");
}
System.out.println("the total donated fund is :"+PmCares.GetTotalFund()+"\n");
System.out.println("the highest transaction mode used is:"+PmCares.GetMode());
	}

}
