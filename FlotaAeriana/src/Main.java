
public class Main {

	public static void main(String[] args) {
		Avion b1 = new Boeing("1");
		Concorde c1 = new Concorde("2");
		Mig m1 = new Mig("3");
		TomCat t1 = new TomCat("4");

		c1.goSuperSonic();
		c1.goSubSonic();
		m1.highSpeedGeometry();
		m1.normalGeometry();
		t1.refeul();		

	}

}
