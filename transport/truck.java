/**
 * This class represents a truck, extending the functionality of a land vehicle.
 *
 * @author Armand Ediae
 * @version 20231206 1854
 * @see car
 * @see landVehicle
 * @see vehicle
 * @see motorbike
 * @since 1
 */
public class truck extends landVehicle {

    // ... other attributes and methods ...

    private int numberOfExhaustPipes; // Number of exhaust pipes
    private float cargoCapacity; // Cargo capacity in cubic meters

    // ... constructors ...

    // Mark Deegan added the no parameters constructor
    public truck()
	{
	}

    /**
     * Constructs a truck with specified parameters.
     *
     * @param axles          Number of axles
     * @param exhaustPipes   Number of exhaust pipes
     * @param seats          Number of seats
     * @param cargoCapacity  Cargo capacity in cubic meters
     * @param fuelType       Type of fuel the truck uses
     */
    public truck(int axles, int exhaustPipes, int seats, float cargoCapacity, String fuelType) {
        // Call the constructor of the superclass
	// Mark Deegan removed this as there is no constructor in the landVehicle class
	// thaty matches these parameters
        // super(axles, seats, fuelType);

        this.numberOfExhaustPipes = exhaustPipes;
        this.cargoCapacity = cargoCapacity;
    }

    // ... other methods ...

    /**
     * Returns a string representation of the truck object.
     *
     * @return String representation of the truck
     */
    @Override
    public String toString() {
        String truckDetails = super.toString(); // Include details from the superclass

        truckDetails += "\nNumber of Exhaust Pipes: " + numberOfExhaustPipes;
        truckDetails += "\nCargo Capacity: " + cargoCapacity + " cubic meters";

        return truckDetails;
    }
}
