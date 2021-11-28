package javaMain;

import java.math.BigInteger;
import java.util.Arrays;

abstract class a{                    //this is an abstract class
	public int dim1,dim2;
	abstract void area();   //abstract method
	abstract void phani();
}
abstract class Triangle extends a{          //if the class which extends abstract class is not implemented all the abstract method(s)
	                                //then this class must also be declared as an abstract
	void area() {
		System.out.println("Area of triangle:"+((dim1*dim2)/2));
	}
}
class Rectangle extends a{
	void area() {
		System.out.println("area of reactangle:"+(dim1*dim2));
	}
	void phani() {
		System.out.println("Hey !");
	}
}

public class Abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Triangle t=new Triangle();        //cant create objects for an abstract classes !

Rectangle r=new Rectangle();
r.dim1=6;
r.dim2=4;
r.area();
BigInteger b=new BigInteger("12");  //this is a class which takes any big number as string 
                                    //and converts into a number and does operations on that number
BigInteger c=new BigInteger("12");
System.out.println(b.add(c));                   //tgis is how operations are done on the big number
System.out.println(b.multiply(c));
	}

}
