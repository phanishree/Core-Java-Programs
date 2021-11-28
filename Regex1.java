package javaMain;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		/*compile mathod is a static factory method ,which returns a object of same class(i.e Pattern class)
		 * Matcher is a class and matcher is a method of Pattern class which returns object of Matcher class
		 * we put the pattern to be searched in complie method argument
		 * we put the string in which the pattern is to be searched in matcher method
		 * m.find() method searches whether  the given pattern is present in the given  string or not , it returns a boolean value
		 *  m.start() method gives the starting index of the pattern in the given string
		 *  m.end() methid gives the ending index of the patter+1
		 *  m.group() method returns the PATTERN WHICH IS BEING SERACHED  */
Pattern p=Pattern.compile("pha");
Matcher m=p.matcher("phaniphaphphphaniph");
Scanner sc=new Scanner(System.in);
int a[]=new int [5];

while(m.find()) {
	count++;
	System.out.println(m.start()+"....."+m.end()+"....."+m.group());
}
System.out.println("the pattern is found "+count+" times");
	}

}
