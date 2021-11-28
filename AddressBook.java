package javaMain;

import java.util.Scanner;

class contact{
	 Scanner sc=new Scanner(System.in);
	private long phno;
	private String name;
	public void FillDetails() {
		System.out.println("enter the name and phone number");
		name=sc.nextLine();
		phno=Long.parseLong(sc.nextLine());
	}
	public String GetName() {
		return name;                                         //accessor
	}
	public long GetNumber() {
		return phno;                               //ACCESSOR
	}}
	class MyAddressBook{
		
		contact c[]=new contact[500];
		Scanner s=new Scanner(System.in);
		int count=0;
		public MyAddressBook() {
			for(int i=0;i<c.length;i++)
				 c[i]=new contact();
		}
		public void AddContact() {
			if(count==c.length)
				System.out.println("Adress book full!");
				else
				{
					c[count].FillDetails();
					count++;
				}}
			public void DisplayAll() {
				for(int i=0;i<count;i++)
				{
					System.out.println("NAME"+"\t"+c[i].GetName()+"NUMBER"+"\t"+c[i].GetNumber()+"\n");
			}
					
		}
			public void DisplayByName() {
				String NAME;
				System.out.println("enter the name to bve searched");
				NAME=s.nextLine();
				for(int i=0;i<count;i++) 
					if(NAME.equalsIgnoreCase(c[i].GetName()))
						System.out.println("NAME"+"\t"+c[i].GetName()+"NUMBER"+"\t"+c[i].GetNumber()+"\n");
					
				
				
			}
			public void DisplayByNumber() {
				long PHNO;
				System.out.println("enter the number to be searched");
				PHNO=s.nextLong();
				for(int i=0;i<count;i++) {
					if(PHNO==c[i].GetNumber())
						System.out.println("NAME"+"\t"+c[i].GetName()+"NUMBER"+"\t"+c[i].GetNumber()+"\n");
			}
			}
	}

public class AddressBook {
public static void  main(String[] args) {
	MyAddressBook book=new MyAddressBook();
           
	while ( true )
	{
		System.out.println("1. Add contact");
		System.out.println("2. Display all");
		System.out.println("3. Search on name");
		System.out.println("4. Search on phone");
		System.out.println("5. Exit");
		Scanner key = new Scanner(System.in);
		int ch = Integer.parseInt( key.nextLine());
		
		if ( ch ==1 )
			book.AddContact();
		else if(ch ==2 )
			book.DisplayAll();
		else if(ch==3)
		{
			book.DisplayByName();
		}
		else if ( ch == 4)
		{
			book.DisplayByNumber();
		}
		else if( ch == 5) break;
	}
}}