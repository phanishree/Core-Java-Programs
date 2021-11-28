package javaMain;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usn="4nI18Cs031";
		String s=usn.substring(1,3).toLowerCase();
		String p=usn.substring(5,7).toLowerCase();
		if(s.equals("nn"))
			 System.out.println("NIE-IT");
		else if(s.equals("ni"))
			System.out.println("NIE");

		if(p.contentEquals("is"))
			System.out.println("INFORMATION SCIENce");
		else if(p.contentEquals("cs"))
            System.out.println("COMPUTER SCIENCE");
		
	}

}
