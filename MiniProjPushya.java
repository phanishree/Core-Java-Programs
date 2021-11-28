package javaMain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class MiniProjPushya {

/*public String toString(String s) {
	return	
	}*/
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int ch;
System.out.println("1.ADMIN"+"\t"+"2.USER");
Scanner sc=new Scanner(System.in);
ch=sc.nextInt();
int ch1=0;
if(ch==1)
{
	String Place;
	String TouristPlace;
	System.out.println("1.to add new data "+"\t"+"2.To Display data");
	 ch1=sc.nextInt();
	if(ch1==1) {
		RandomAccessFile pg=new RandomAccessFile("data.dat","rw");
		pg.seek(pg.length());
	Place=sc.next();
	
	TouristPlace=sc.next();
	
	pg.writeUTF(Place);
	pg.writeUTF(TouristPlace);
//	System.out.println(pg);
	pg.close();
	}
}
 if(ch==2||ch1==2) {
	try {
		RandomAccessFile pg=new RandomAccessFile("data.dat","r");
		int n=(int)(pg.length()/15);
		for(int i=0;i<n;i++) {
			String p1=pg.readUTF();
			String p2=pg.readUTF();
			System.out.println((i+1)+"."+p1+"\t"+"places to visit:"+p2);
		}
	}
	catch(Exception e) {
}}
	}

}
