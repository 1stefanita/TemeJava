
public class Avion {
     int totalEnginerPower;	
	 String planeID; 
		
	public String getPlaneID() {
			return planeID;
		}
		public Avion(String planeID) {
			this.planeID = planeID;
		}
		  public int getTotalEnginePower() {
			  return totalEnginerPower;
		  }
		  public void takeOff() {
			  System.out.println( "PlaneID_Value-Initianting takeoff preocedure -Starting engines Accelerating down the runway - Taking off - Retracting gear - Takeoff complete");
		  }
		  public void land() {
			  System.out.println("PlaneID-Value - Initiating landing procedure - Enabling airbrakes -- Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete" );
			  }
		  public void fly() {
			  System.out.println("PlaneID Value - Flying");
			  
		  }
		  
		  
	
}
