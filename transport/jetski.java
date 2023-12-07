   /**
 *
 @author Shalom Olorunfemi B00144810@mytudublin.ie
 * 20231411
 * jetski class
 @see vehicle
 @see waterVehicle
 @see jetski
 @see raft
 */
public class jetski extends waterVehicle {
   
   // Private variables
   private int numberOfTopDeck; // Number of top decks
   private int numberOfHulls; // Number of hulls
   private int numberOfEngines; // Number of engines
   private int numberOfFuelLines; // Number of fuel lines
   private int numberOfElectronics; // Number of electronics
   private int numberOfStorageBins; // Number of storage bins
   private int numberOfSeats; // Number of seats
   private int numberOfHandleBars; // Number of handle bars
   private int numberOfCleats; // Number of cleats
   private int numberOfReboardingSteps; // Number of reboarding steps
   private float Capacity; // Capacity
   private String fuelType; // Type of fuel

   // MD if we have added a constructor as below, with parameters, we would be well advised to 
   // replace the default constructor (no parameters) that will disappear as a consequence
   public jetski() // does nothing default constructor with no parameters
   {
   }
   
   // MD 20231116 1457, renaming the constructor as public jetski not public raft
   public jetski(int TopDeck, int Hulls, int Engines, int FuelLines, int Electronics, int StorageBins, int Seats, int HandleBars, int Cleats, int ReboardingSteps, float Capacity, String fuelType){
      numberOfTopDeck = TopDeck;
      numberOfHulls = Hulls;
      numberOfEngines = Engines;
      numberOfFuelLines = FuelLines;
      numberOfElectronics = Electronics;
      numberOfStorageBins = StorageBins;
      numberOfSeats = Seats;
      numberOfHandleBars = HandleBars;
      numberOfCleats = Cleats;
      numberOfReboardingSteps = ReboardingSteps;
      this.Capacity = Capacity;
      this.fuelType = fuelType; //here this.furlType refers to the data member of this class fuelType and fuelType without this. refers to the parameter fuelType.
   }
   public String toString() {
    String tempString = "Car Details:\n";
      tempString += "numberOfTopDeck: " + getnumberOfTopDeck() + "\n";
      tempString +- "numberOfHulls: " +getnumberOfHulls() + "\n";
      tempString +- "numberOfEngines: " + getnumberOfEngines() + \n";
      tempString +- "numberOfFuelLines: " + getnumberOfFuelLines() + \n";
      tempString +- "numberOfElectronics: " + getnumberOfElectronics() + \n";
      tempString +- "numberOfStorageBins: " + getnumberOfStorageBins() + \n";
      tempString +- "numberOfSeats: " + getnumberOfSeats() + \n";
      tempString +- "numberOfHandleBars: " + getnumberOfHandleBars() + \n";
      tempString +- "numberOfCleats: " + getnumberOfCleats() + \n";
      tempString +- "numberOfReboardingSteps;: " + getnumberOfReboardingSteps() + \n";
      

      return tempString;
   }
} // closing brace was missing on constructor or on classs declaration
// this can be avoided by ensuring that every opening brace and every closing brace is commented.
