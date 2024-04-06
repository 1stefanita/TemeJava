public class Main {

	public static void main(String[] args) {
Depozit depozit = new Depozit();

	depozit.adaugaProdus(new Produs("p1","Produs1",  10.0,20));
	depozit.adaugaProdus(new ProdCompensate("p2","Produs2", 24.0 , 14, 1.4));
	
	depozit.adaugaProdus(new Produs("p4", "Produs4", 25.0, 30));

		System.out.println("Inventar Produs");
		depozit.inventarTiparit();
	}

}
