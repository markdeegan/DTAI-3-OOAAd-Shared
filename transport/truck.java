/**
This class represents a truck, extending the functionality of a land vehicle.

@author Armand Ediae
@version 20231115 1301
@see car
@see landVehicle
@see vehicle
@see motorbike
@since 1
*/
public class truck extends landVehicle {

    // Private variables specific to the truck class
    private int numberOfExhaustPipes; // Number of exhaust pipes
    private float cargoCapacity; // Cargo capacity in cubic meters
  

    /**
     Constructs a truck with specified parameters.
     
     @param axles Number of axles
     @param exhaustPipes Number of exhaust pipes
     @param seats Number of seats
      @param cargoCapacity Cargo capacity in cubic meters
      @param fuelType Type of fuel the truck uses
     */
    public truck(int axles, int exhaustPipes, int seats, float cargoCapacity, String fuelType) {
        // MD20231201 - this wwil casue a problem, as it is written.
        // this assumes a constructo for the super class (landVehicl) that takes int, int, String.
        // no such constructor exists in class landVehicle, so we can's use that.
        // the closest that exists is
        // public landVehicle(int seats, float engineSize, String gearboxType, String fuelType, boolean isConvertible, String color, int headlights) {
        // so, we will comment out the call to super, and consider using the setter methods, if they exist, in the base class landVehicle
        super(axles, seats, fuelType);
        numberOfExhaustPipes = exhaustPipes;
        this.cargoCapacity = cargoCapacity;
        
    }

    /**
      Constructs a truck with specified parameters.
     
      @param axles Number of axles
      @param seats Number of seats
      @param fuelType Type of fuel the truck uses
     */
   
    /**
      Default constructor with no parameters.
     */
    public truck() {
        super();
        // Initialize default values or leave them as they are
    }

    // Getter methods for retrieving values

    // Setter methods for modifying values
}
