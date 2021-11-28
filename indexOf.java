package javaMain;

public class indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String email="phanis18191@gmail.com";
int index=email.indexOf("@");
System.out.println("the index of @ is :" + index);
System.out.println("the usernam is:" +email.substring(0,index));
System.out.println("the service provuder is:" + email.substring(index+1,email.length()));
	}

}
