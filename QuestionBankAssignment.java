package javaMain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuestionBankAssignment {

	public static void main(String[] args) {
		int AdvanceSize=0,BasicSize=0;
		Random r=new Random();
		ArrayList<String> AdvanceAndBasic=new ArrayList<String>();
		while(true) {
		try {
			BufferedReader b=new BufferedReader(new FileReader("Qadvance.txt"));
			String reader1;
			while((reader1=b.readLine())!=null) {
				AdvanceAndBasic.add(reader1);
			}
			b.close();
			AdvanceSize=AdvanceAndBasic.size();
			BufferedReader c=new BufferedReader(new FileReader("Qbasic.txt"));
			String reader2;
			while((reader2=c.readLine())!=null) {
				AdvanceAndBasic.add(reader2);
			}
			c.close();
			BasicSize=AdvanceAndBasic.size()-AdvanceSize;
		}
		catch(Exception e) { System.out.println("Oopos,something went wrong!!....please check the program");}
		System.out.println("1.Generate questions");
		System.out.println("2.Exit");
		System.out.println("Enter the choice");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		if(ch==1) {
			ArrayList<Integer> ArrayOfRandomNums=new ArrayList<Integer>();
			int n=(1+r.nextInt(10));
			int i;
			for( i=0;i<n;i++) {
				ArrayOfRandomNums.add(r.nextInt(AdvanceSize));
				System.out.println("advance}"+(i+1)+":"+AdvanceAndBasic.get(ArrayOfRandomNums.get(i)));
			}
			for(int j=0 ;j<(10-n);j++,i++) {
				ArrayOfRandomNums.add((AdvanceSize+r.nextInt(BasicSize)));
				System.out.println("basic}"+i+":"+AdvanceAndBasic.get(ArrayOfRandomNums.get(i)));
				}
			
			
		}
		else if(ch==2)
			break;

	}

}
}