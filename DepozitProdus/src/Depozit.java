import java.util.HashMap;
import java.util.Map;

public class Depozit {
    private Map<String, Produs> inventar = new HashMap<>();

	
         public void adaugaProdus(Produs produs) {
        	 if (inventar.containsKey(produs.getCod())) {
        		 Produs existingProdus = inventar.get(produs.getCod());
        		
        		existingProdus.setCantitate(existingProdus.getCantitate() + produs.getCantitate());

        	 } else {
                 inventar.put(produs.getCod(), produs);
        		 
        	 }
         }
         public void inventarTiparit() {
        	 for(Produs produs : inventar.values()) {
                 System.out.println("Cod: " + produs.getCod() + ", Nume: " + produs.getNume() +
                         ", Preț: " + produs.getPbaza() + ", Cantitate: " + produs.getCantitate());        	 }
         }
	
}
