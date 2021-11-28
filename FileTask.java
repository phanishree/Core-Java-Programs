package javaMain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileTask{

	public static void main(String[] args) throws IOException    
	{
			Scanner sc=new Scanner(System.in);
		while( true)
		{
			System.out.println("1. Add task");
			System.out.println("2. List all");
			System.out.println("3. Exit");
		/*	PrintWriter p = new PrintWriter( new FileWriter("c:/ftp/task.txt"));
			p.println("hello");
			p.close();*/
			int choice = sc.nextInt();
			if( choice ==1 )
			{
				System.out.println("Enter task ?");
				String task = sc.next();
				
				PrintWriter q = new PrintWriter( new FileWriter("task.txt", true));
				q.println(task);
				q.close();
			}
			else if( choice ==2 )
			{
				BufferedReader reader = new BufferedReader( new FileReader("task.txt"));
				String record;
				int Ln = 1;
				System.out.println("---------------------------------------------");
				while( (record = reader.readLine())!=null )
					System.out.printf("%d)%s\n", Ln++ ,  record);
				
				
				System.out.println("---------------------------------------------");
				reader.close();
			}
			else if( choice==3)
				break;
		}
		
		
	}
}







