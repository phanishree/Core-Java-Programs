package javaMain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AssingmentOnFileCreation {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int empno;

Scanner sc=new Scanner(System.in);

Date d=new Date();
String dateandtime=d.toGMTString();
String n=dateandtime.substring(0,2);
n=n+".txt";
int date=d.getDate();
String l=dateandtime.substring(0,11);
int ch=0;
JOptionPane.showMessageDialog(null, "Program terminated !"); //this can be used in normal programs too !!!
do {
	if(ch==3) {
		System.exit(0);
	}
System.out.printf("1.to write to a file\n2.to read a file\n(1,2)");
 ch=sc.nextInt();
if(ch==1) {
	System.out.println("enter the employee number");
	empno=sc.nextInt();
PrintWriter p=new PrintWriter(new FileWriter(n,true));
p.printf("employee number:%d,%s\n",empno,l);
p.close();
//ch=2;
}
else if(ch==2) {
BufferedReader red=new BufferedReader(new FileReader(n));
String b;
while(( b=red.readLine())!=null)
System.out.println(b);  
red.close();
}}while(ch!=1||ch!=2);
	}

}
