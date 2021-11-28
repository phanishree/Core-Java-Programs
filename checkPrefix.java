package javaMain;

public class checkPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="ms.,phani";
		String s=name.toLowerCase();
		if(s.startsWith("mr."))
			System.out.println("male");
		else if(s.startsWith("mrs."))
			System.out.println("married lady");
		else if(s.startsWith("ms."))
			System.out.println("female");
		else
			System.out.println("undefined");
		

	}

}
