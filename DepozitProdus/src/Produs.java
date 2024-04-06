public class Produs {

 public String cod;
 public String nume;
 public double Pbaza;
 public int cantitate;
 

 public Produs(String code, String nume, double Pbaza, int cantitate ) {
	 this.cod = code ;
	 this.nume = nume;
	 this.Pbaza = Pbaza;
	 this.cantitate = cantitate;
	 
 }


public String getCod() {
	return cod;
}


public void setCod(String cod) {
	this.cod = cod;
}


public String getNume() {
	return nume;
}


public void setNume(String nume) {
	this.nume = nume;
}


public double getPbaza() {
	return Pbaza;
}


public void setPbaza(double pbaza) {
	Pbaza = pbaza;
}


public int getCantitate() {
	return cantitate;
}


public void setCantitate(int cantitate) {
	this.cantitate = cantitate;
}
 
}
