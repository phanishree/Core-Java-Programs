package javaMain;

import java.util.Scanner;

interface musicPlayer{
	void play();
	void songs();
}
abstract class spotify implements musicPlayer{              //partially implemented interface
	public void play() {
		System.out.println("Welcome to spotify :-) ");
	}
}
class SpotifySongs extends spotify{
	public void songs() {
		System.out.print("-----*****------******-----******-------\n");
		System.out.print("1.Hot Bilboard 100\n2.Hot singles\n3.Best of TaylorSwift");
	}
}
abstract class appleMusic implements musicPlayer{         //partially implemented interface
	public void play() {
		System.out.println("Welcome to Apple Music ;-)");
	}
}
class AppleSongs extends appleMusic{
	public void songs () {
		System.out.print("-----*****------******-----******-------\n");
		System.out.print("1.Best of Rachu (Classical)\n2.Best of Charlie Puth\n3.Best pf Brendon Urie(panic at the disco\n");
	}
}

public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
musicPlayer m;
Scanner sc=new Scanner(System.in);
String os=System.getProperty("os.name");
System.out.println("What OS do you use?");
String name=sc.nextLine();
if(name.toLowerCase().contentEquals("android")) {
	SpotifySongs s=new SpotifySongs();                     //here the objects cant be created for abstract calsses
	m=s;
	m.play();
	m.songs();
}
else if(name.toLowerCase().contentEquals("ios")) {
	AppleSongs a=new AppleSongs();
	m=a;
	m.play();
	m.songs();
}

	}

}
