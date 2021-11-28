package javaMain;

import java.util.Scanner;

class student{
	String name,branch;
	int rgno;
	void FillDetails() {
		System.out.println("entere the name,branch,reg no");
		Scanner sc=new Scanner (System.in);
		name=sc.nextLine();
		branch=sc.nextLine();
		rgno=sc.nextInt();
	}
	public String toString() {
		return String.format("%s,%s,%d",name,branch,rgno);
	}
	public boolean equals(Object args) {
		student s3=(student)args;
		if(rgno==s3.rgno&&branch.equals(s3.branch))
			return true;
		else
			return false;
	}
}
public class TostringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1=new student();
student s2=new student();
s1.FillDetails();
s2.FillDetails();
System.out.println(s1);
System.out.println(s2);
if(s1.equals(s2))
	System.out.println("the values of objects are equal");
else
	System.out.println("the values of objects are not equal");

	}

}
