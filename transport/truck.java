 
   /**
 * This class represents a truck, extending the functionality of a land vehicle.
 *
 * @author Armand Ediae
 * @version 20231115 1301
 */
public class truck extends landVehicle {

    // Private variables specific to the truck class
    private int numberOfExhaustPipes; // Number of exhaust pipes
    private float cargoCapacity; // Cargo capacity in cubic meters
    private String fuelType; // Type of fuel the truck uses

    /**
     * Constructs a truck with specified parameters.
     *
     * @param axles Number of axles
     * @param exhaustPipes Number of exhaust pipes
     * @param seats Number of seats
     * @param cargoCapacity Cargo capacity in cubic meters
     * @param fuelType Type of fuel the truck uses
     */
    public truck(int axles, int exhaustPipes, int seats, float cargoCapacity, String fuelType) {
        super(axles, seats);
        numberOfExhaustPipes = exhaustPipes;
        this.cargoCapacity = cargoCapacity;
        this.fuelType = fuelType;
    }

    /**
     * Constructs a truck with specified parameters.
     *
     * @param axles Number of axles
     * @param seats Number of seats
     * @param fuelType Type of fuel the truck uses
     */
    public truck(int axles, int seats, String fuelType) {
        super(axles, seats);
        this.fuelType = fuelType;
    }

    /**
     * Default constructor with no parameters.
     */
    public truck() {
        super();
        // Initialize default values or leave them as they are
    }

    // Getter methods for retrieving values

    // Setter methods for modifying values
}
