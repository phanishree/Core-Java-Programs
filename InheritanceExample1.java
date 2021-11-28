package javaMain;
class box {
	double height;
	double width;
	double depth;
	public box(box b) {
		width=b.width;
		depth=b.depth;
		height=b.height;
	}
	public box(double w,double h,double d) {
		width=w;
		height=h;
		depth=d;
	}
	box(){
		width=-1;
		depth=-1;
		height=-1;
	}
	box(double len){
		width=height=depth=len;
	}
	double volume() {
		return width*depth*height;
	}
}
class boxWeight extends box{
	//super.volume();
	//super.width=435;
	double weight;
	
	boxWeight(boxWeight bw){
		super(bw);
		weight=bw.weight;
	}
	boxWeight(double w,double h,double d,double we){
		super(w,h,d);
		weight=we;
	}
	boxWeight(){
		super();
		weight=-1;
	}
	boxWeight(double len){
		super(len);
	}
	
}
public class InheritanceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boxWeight ob1=new boxWeight(2,5,5,1);
boxWeight ob2=new boxWeight(10,10,10,75);
boxWeight ob3=new boxWeight(3);
boxWeight ob4=new boxWeight();
boxWeight ob5=new boxWeight(ob1);

System.out.println("The volume of object1 is "+ob1.volume());
System.out.println("The volume of object2 is "+ob2.volume());
System.out.println("The volume of object3 is "+ob3.volume());
System.out.println("The volume of object3 is "+ob4.volume());
System.out.println("The values of width ,depth,height,weight of object1 are"+ob1.width+" "+ob1.depth+" "+ob1.height+" "+ob1.weight);
System.out.println("The values of width ,depth,height,weight of object5 are"+ob5.width+" "+ob5.depth+" "+ob5.height+" "+ob5.weight);
	}

}
