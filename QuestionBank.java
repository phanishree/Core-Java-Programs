package javaMain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuestionBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> q=new ArrayList<String>();
while(true) {
try {
	BufferedReader r=new BufferedReader(new FileReader("Qbank.txt"));
	
	String record;
	while((record=r.readLine())!=null){
		q.add(record);
	}
	r.close();
	}
 catch (FileNotFoundException f) {
	 System.out.println("sorry,the file cant be found");
	//FileNmae="Qbank";
	}
catch (IOException e) {
	e.printStackTrace();
}
ArrayList<Integer> qs=new ArrayList<Integer>();
Random r=new Random();
for(int i=0;qs.size()!=10;i++) {
	qs.add(r.nextInt(q.size()));
}

System.out.println("1.Gernrate questions"+"\n");
System.out.println("2.Exit"+"\n");
int ch;
Scanner sc=new Scanner(System.in);
System.out.println("enetr the choice");
ch=sc.nextInt();
if(ch==1) {
	for(int i=0;i<qs.size();i++) {
		System.out.println((i+1)+")"+q.get(qs.get(i)));
	}
}
else if(ch==2)
	break;

	}}

}
