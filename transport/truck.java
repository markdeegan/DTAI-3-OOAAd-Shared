/**
 * Armand Ediae
 * 20231109 1144
 * truck class
 */
public class truck extends landVehicle {

    // Private variables
    private int numberOfAxles; // Number of axles
    private int numberOfExhaustPipes; // Number of exhaust pipes
    private int numberOfSeats; // Number of seats
    private float cargoCapacity; // Cargo capacity in cubic meters
    private String fuelType; // Type of fuel the truck uses

    // Full constructor for initializing all variables
    public truck(int axles, int exhaustPipes, int seats, float cargoCapacity, String fuelType) {
        super(); // Assuming a default constructor in landVehicle, you can adjust this based on your actual implementation
        numberOfAxles = axles;
        numberOfExhaustPipes = exhaustPipes;
        numberOfSeats = seats;
        this.cargoCapacity = cargoCapacity;
        this.fuelType = fuelType;
    }

    // Constructor with some parameters 
    public truck(int axles, int seats, String fuelType) {
        super(); // Assuming a default constructor in landVehicle, you can adjust this based on your actual implementation
        numberOfAxles = axles;
        numberOfSeats = seats;
        this.fuelType = fuelType;
    }

    // Default constructor with no parameters
    public truck() {
        super(); // Assuming a default constructor in landVehicle, you can adjust this based on your actual implementation
        // Initialize default values or leave them as they are
    }

    // Getter methods for retrieving values
    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public int getNumberOfExhaustPipes() {
        return numberOfExhaustPipes;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public float getCargoCapacity() {
        return cargoCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

   
}
