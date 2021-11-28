package javaMain;

import java.util.Arrays;
import java.util.LinkedList;

import java.util.Scanner;
class fddf{
	protected int i=10;
}


public class TryError {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//	String h="<h1><h1>Sanjay has no watch</h1></h1>";
//String h="<h1><h1>Sanjay has no watch</h1></h1>";
		System.out.println("hey");
		String h=sc.nextLine();
		int r=h.indexOf('>', 0);
		int e=h.indexOf('/',h.length()-4);
		String st=h.substring(r+1);
		if(st.startsWith("<")) {
			int f=st.indexOf('>', 0);
			int g=st.indexOf('/',st.length()-4);
			String i=st.substring(1,r);
			String z=st.substring(g+1,st.length()-1);
			if(i.equals(z)){
				String gh=st.substring(f+1,g-1);
				if(gh.contains("<")) {
					gh=gh.substring(0,gh.indexOf("<"));
				}
             System.out.println(gh);
			
		}
			else
				System.out.println("none");}
		else {
		
		String w=h.substring(1,r);
		
		String q=h.substring(e+1,h.length()-1);
		System.out.println("w="+w+" q="+q);
		if(w.equals(q)){
			String t=h.substring(r+1,e-1);
			/*if(t.startsWith("<")) {

				int a=t.indexOf('>', 0);
				int b=t.indexOf('/',1);
				String iu=t.substring(1,r);
				String zu=t.substring(g+1,t.length()-1);
				if(iu.equals(zu)){
					String gh=t.substring(a+1,b-1);
                 System.out.println(gh);
				}
				else*/
			System.out.println(t);
		}
		else
			System.out.println("none");
	}
		}	}
		/*String smallest = "";
        String largest = "";
        String s="welcomephanisaaabcd";
        int k=3;
        int y=k;
        System.out.println("enter");
        String f[]=new String[s.length()-k+1];
        for(int i=0;i<s.length()-k+1;i++){
            f[i]=s.substring(i,y);
            y++;
        }
       System.out.println(Arrays.toString(f));
        int l=f.length;
          String t="";
       for(int i=0;i<l;i++){
           for(int j=i+1;j<l;j++){
               if(f[i].compareTo(f[j])>0){
                 t=f[i];
                   f[i]=f[j];
                   f[j]=t;
               }
           }
       } 
        smallest=f[0];
        largest=f[f.length-1];
System.out.println(smallest+" "+largest);
	}}
	
	/*	int n=3;
		String t;
		Scanner sc=new Scanner(System.in);
		String na[]=new String[n];
		System.out.println("enter");
		for(int  i=0;i<n;i++) {
			na[i]=sc.next();
			int g=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		for(int j=i+1;j<n;j++) {
			if(na[i].compareTo(na[j])>0) {
				t=na[i];
				na[i]=na[j];
				na[j]=t;
			}
		}
		System.out.println("sorted names are");
		for(int i=0;i<n;i++)
			System.out.print(na[i]+",");
	}}
	/*	System.out.println("Enter  the 2 numbers to be added");
		Scanner sc=new Scanner(System.in);
		String n1=sc.next();
		int dummy=sc.nextInt();
		String n2=sc.next();
		LinkedList<Integer> L1 = new LinkedList<Integer>( );
		LinkedList<Integer> L2 = new LinkedList<Integer>( );
		LinkedList<Integer> L3 = new LinkedList<Integer>( );
		fddf f=new fddf();
		System.out.println(f.i);
		
		for( int i=0; i<n1.length(); i++)
		{
			String eachdigit = n1.substring(i , i+1);
			L1.addFirst(Integer.parseInt(eachdigit));
		}
			
		for( int i=0; i<n2.length(); i++)
		{
			String eachdigit = n2.substring(i , i+1);
			L2.addFirst(Integer.parseInt(eachdigit));
		}
		
		
		int carry = 0;
		while( L1.size()!= 0 && L2.size()!=0)
		{
			int res = L1.getFirst() + L2.getFirst() + carry;
			L3.addFirst( res % 10 );
			carry = res/ 10;
			
			L1.removeFirst();
			L2.removeFirst();
		}
		
		LinkedList<Integer> temp;
		
		if( L1.size()==0)
			temp = L2;
		else
			temp =  L1;
		
		while( temp.size()!=0)
		{
			int res = temp.getFirst() + carry;
			L3.addFirst( res % 10 );
			carry = res/ 10;
			
			temp.removeFirst();
		}
			
		
		if( carry != 0 )
			L3.addFirst( carry);
		
		
		System.out.println("Sum ");
		
		for( int i=0; i<L3.size(); i++)
			System.out.print( L3.get(i));
	}}
	
		// TODO Auto-generated method stub
/*int St[]= {10,30,40,50};
Scanner scan = new Scanner(System.in);
String s = "\\kdb fkbk";
if(s.matches("kbd fkdk"))
	System.out.println("true");
else
	System.out.println("false");
	}}
// Write your code here.
/*String main[]= {""};
ArrayList<String[]> l=new ArrayList();
//String st[]={"\\!","\\,","\\?"};
String st[]={"\\!","\\,","\\?","\\.","\\_","\\'","\\@"};
for(int i=0;i<st.length;i++){
    main=s.split(st[i]);
    s=main+"";
}
for(int i=0;i<s.length();i++)
	System.out.println(s.charAt(i));
//String rgerh=st+"";
//System.out.println(st);

//for(int i=0;i<main.length;i++)
	//System.out.println(main[i]);

	}}
//String h="gjgk!*f g bhjoi";
/*for(int i=0;i<st.length;i++){
   l.add(s.split(st[i]));
   
//s=l+"";
}
//main=h.split(" ");
//main=h.split("\\ ");
//System.out.println(main);
for(int i=0;i<l.size();i++)
	System.out.println(l.get(i));
//System.out.print(s);

//for(int i=0;i<main.length;i++)
	//System.out.println(main[i]);

	}

}*/
