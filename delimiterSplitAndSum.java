package javaMain;

public class delimiterSplitAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="1,6,3";
//int a[]=new int[100];
int sum=0;
String val[]=s.split(",");
for(int i=0;i<val.length;i++) {
	 sum+= Integer.parseInt(val[i]);
}
System.out.println(sum);
	
	}

}
