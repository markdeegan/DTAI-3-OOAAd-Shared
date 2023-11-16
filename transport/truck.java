 /**
 * Armand Ediae
 * 20231115 1301
 * truck class
 */
public class truck extends landVehicle {

    //* Private variable specific to the truck class
    private int numberOfExhaustPipes; /** Number of exhaust pipes */
    private float cargoCapacity; /** Cargo capacity in cubic meters */
    private String fuelType; /** Type of fuel the truck uses */

    /** Full constructor for initializing all variables 
    @param axles number of axles on this vehicle
    */
 public truck(int axles, int exhaustPipes, int seats, float cargoCapacity, String fuelType)
 {
        super(axles, seats); //* Assuming a constructor in landVehicle that accepts axles and seats
        numberOfExhaustPipes = exhaustPipes;
        this.cargoCapacity = cargoCapacity;
        this.fuelType = fuelType;
 }

    //* Constructor with some parameters 
    public truck(int axles, int seats, String fuelType) {
        super(axles, seats); //*Assuming a constructor in landVehicle that accepts axles and seats
        this.fuelType = fuelType;
    }

    //* Default constructor with no parameters
    public truck() {
        super(); //* Assuming a default constructor in landVehicle
        //* Initialize default values or leave them as they are
    }

    //* Getter methods for retrieving values

    public int getNumberOfExhaustPipes() {
        return numberOfExhaustPipes;
    }

    public float getCargoCapacity() {
        return cargoCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    //* Setter methods for modifying values

    //* Setter for numberOfExhaustPipes
    public void setNumberOfExhaustPipes(int exhaustPipes) {
        numberOfExhaustPipes = exhaustPipes;
    }

    //* Setter for cargoCapacity
    public void setCargoCapacity(float capacity) {
        cargoCapacity = capacity;
    }

    //* Setter for fuelType
    public void setFuelType(String type) {
        fuelType = type;
    }
}
