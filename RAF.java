 package javaMain;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class RAF {


	@SuppressWarnings("resource")
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//int array[]= {10,320,40,50,60};
		int a;
		String name;
	//	float b;
		while(true) {
	
		System.out.println("1.add data"+"\n"+"2.read data"+"\n"+"3.exit"+"\n");
		int ch=sc.nextInt();
		if(ch==1) {

try {
	RandomAccessFile r = new RandomAccessFile("raf.txt","rw");
	r.seek(r.length());
System.out.println("enter int,String,float");
a=Integer.parseInt(sc.next());
name=sc.next();
//b=sc.nextFloat();

r.writeInt(a);
r.writeUTF(name);
//r.writeFloat(b);
r.close();
}catch(Exception e) {
	
}}
		else if(ch==2) {
try {
	
	RandomAccessFile r = new RandomAccessFile("raf.txt","r");
int n=(int)(r.length()/11);
for(int i=0;i<n;i++) {
	int g=r.readInt();
	String sl=r.readLine();
	//float fg=r.readFloat();
	System.out.println(g+"\t"+sl+"\n");
}r.close();}
catch(Exception e) {
	
}}
		else if(ch==3)
			break;
	}}
	
}
