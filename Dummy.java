package javaMain;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

//import stdio.Keyboard;

class Log
{
    private String number , datetime , type;
    String [ ] types = {"i", "o", "m"};
    private Random rnd = new Random();
    
    public void CreateLog()
    {
        number = "98451" + (10000 + rnd.nextInt(9999));
        datetime = new Date().toString();
        type = types[ rnd.nextInt( 3 ) ];
    }
    
    public void setDetails( String record )
    {
        String vals[ ] = record.split("\t");
        number = vals[0];
        datetime = vals[1];
        type = vals[2];
    }
    
    public String toString()
    {
        return String.format("%-10s\t%-20s\t%s", number , datetime , type);
    }
}

public class Dummy {

	public static void main(String[] args)  
	{
		Stack<Log> S = new Stack<Log>( );
		
		try
		{
			BufferedReader reader = new BufferedReader( new FileReader( "logs.txt"));
			String record;
			while( ( record = reader.readLine() )!= null)
			{
				Log tmp = new Log();
				tmp.setDetails(record);
				S.push(tmp);
			}
		}
		catch( Exception e)
		{
			
		}
		
		while( true)
		{
			System.out.println("1. Add entry to log");
			System.out.println("2. View recent log");
			System.out.println("3. Check all logs and clear");
			System.out.println("4. Exit");
			Scanner sc=new Scanner(System.in);
			int ch = Integer.parseInt(sc.next());
			if( ch ==1 )
			{
			  Log L = new Log();
			  L.CreateLog();
			  
			  S.push( L);
			}
			else if( ch == 2 ) {
				try
				{
					Log recent =S.peek();
					System.out.println( recent);   // toString ( ) will be invoked
				}
				catch( java.util.EmptyStackException e)
				{
					System.out.println("No recent call logs !!!");
				}
			}
			else if( ch == 3 )
			{
				while( !S.empty())
				{
					System.out.println( S.pop() );
				}
			}
			else if( ch == 4)
			{
				try
				{
					Stack<Log>temp = new Stack<Log>( );   // If not stored into another stack , file entries
														  // will be in reverse order of calls received
					
					while( !S.empty())
					{
						temp.push( S.pop() );
					}
					
					PrintWriter p = new PrintWriter( new FileWriter( "logs.txt"));
					while( !temp.empty())
					{
						p.println( temp.pop() );
					}
					p.close();
				}
				catch( Exception e){ }
				break;
			}
		}
	}
}

