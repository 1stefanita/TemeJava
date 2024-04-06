
public class ProdCompensate extends Produs {
private double coeficient;

public ProdCompensate(String code, String nume, double Pbaza, int cantitate, double d) {
	super(code, nume, Pbaza, cantitate);
	this.coeficient= coeficient;
	
}
public double getPbaza() {
	return super.getPbaza() * coeficient;
	
}
}
