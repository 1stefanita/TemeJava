
public class Concorde extends DeCalatori {
		
	public Concorde(String planeID) {
		super(planeID);
	}
public void goSuperSonic() {
	System.out.println(planeID + " - Supersonic mode activated");
}
public void goSubSonic() {
	System.out.println(planeID + "- Supersonic mode deactivated");	
}
}
