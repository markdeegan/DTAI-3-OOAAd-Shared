   /**
 * 
 @author Shalom Olorunfemi B00144810@mytudublin.ie
 * 20231411
 * raft class
 @see vehicle
 @see waterVehicle
 @see raft
 @see jetski
 */
public class raft extends waterVehicle {
   
   // Private variables
   private int numberOfTubes; // Number of tubes
   private int numberOfSeams; // Number of seams
   private int numberOfValves; // Number of valves
   private int numberOfFloors; // Number of floors
   private int numberOfThwarts; // Number of thwarts
   private float Capacity; // Capacity
   private String fuelType; // Type of fuel the truck uses

   public raft(int Tubes, int Seams, int Valves, int Floors, int Thwarts, float Capacity, String fuelType){
      numberOfTubes = Tubes;
      numberOfSeams = Seams;
      numberOfValves = Valves;
      numberOfFloors = Floors; // MD20231116 assigned as floors here, but passed as Floors above, fixed it now
      numberOfThwarts = Thwarts;
      this.Capacity = Capacity;
      this.fuelType = fuelType; //here this.furlType refers to the data member of this class fuelType and fuelType without this. refers to the parameter fuelType.
   }
   public String toString() {
    String tempString = "Raft Details:\n";
      tempString += "numberOfTubes: " + getnumberOfTubes() + "\n";
      tempString += "numberOfSeams: " +getnumberOfSeams() + "\n";
      tempString += "numberOfValves: " + getnumberOfValves() + "\n";
      tempString += "numberOfFloors: " + getnumberOfFloors() + "\n";
      tempString += "numberOfThwarts: " + getnumberOfThwarts() + "\n";

      return tempString;
   }    
} // again, missing closing brace on either constructor or on class declaration
// again this aould be avoided by ensuring that all openeing braces { and all closing braces } are commented
