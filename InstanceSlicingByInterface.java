package javaMain;

interface popsingers{
	void vocalists();
	void guitarist();
	void highpitch();
}
interface bands{
	void bandnames();
	void famousamongbands();
}

class chaloLetsImplement implements popsingers,bands{

	@Override
	public void bandnames() {
		// TODO Auto-generated method stub
		System.out.println("bands:"+"\n"+"One direction"+"\n"+"panic at the diso"+"\n"+"imagine dragons");
	}

	@Override
	public void famousamongbands() {
		// TODO Auto-generated method stub
		System.out.println("Famous among bands:"+"One direction");
	}

	@Override
	public void vocalists() {
		// TODO Auto-generated method stub
		System.out.println("Vocalists:"+"\n"+"Taylor swift"+"\n"+"Ariana grande"+"\n"+"Rachuuu");
	}

	@Override
	public void guitarist() {
		// TODO Auto-generated method stub
		System.out.println("Guitarist:"+"Taylor swift");
	}

	@Override
	public void highpitch() {
		// TODO Auto-generated method stub
		System.out.println("Hgh pitch:"+"\n"+"Ariana grande"+"\n"+"Rachuuuuuuuuuu"+"\n"+"Adele"+"\n"+"Zayn");
	}
	
}

public class InstanceSlicingByInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
popsingers p=new chaloLetsImplement();                 /*Here we see that the instance of class is been sliced
                                                                  to 2 interfaces*/
bands h=new chaloLetsImplement();
p.guitarist();
p.vocalists();
p.highpitch();
h.bandnames();
h.famousamongbands();
	}

}
