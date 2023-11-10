/**
 * Armand Ediae
 * 20231109 1144
 * Truck class
 */
public class Truck extends LandVehicle {

    // Method to set the number of axles
    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    // Private variables
    private int numberOfAxles; // Number of axles
    private int numberOfExhaustPipes; // Number of exhaust pipes
    private int numberOfSeats; // Number of seats
    private float cargoCapacity; // Cargo capacity in cubic meters
    private String fuelType; // Type of fuel the truck uses

    // Constructor for initializing variables
    public Truck(int axles, int exhaustPipes, int seats, float cargoCapacity, String fuelType) {
        numberOfAxles = axles;
        numberOfExhaustPipes = exhaustPipes;
        numberOfSeats = seats;
        this.cargoCapacity = cargoCapacity;
        this.fuelType = fuelType;
    }

    // Setter method for the number of seats
    public void setNumberOfSeats(int seats) {
        numberOfSeats = seats;
    }

    

}
