/**
 * Armand Ediae
 * 20231109 1149
 * Car class
 */
public class Car extends LandVehicle {

    private int numberOfHeadlights;
    private int numberOfSeats;
    private float engineSize;
    private String gearboxType;
    private String fuelType;
    private boolean isConvertible;
    private String color;

    // Constructor for initializing variables
    public Car(int headlights, int seats, float size, String gearbox, String fuel, boolean convertible, String carColor) {
        numberOfHeadlights = headlights;
        numberOfSeats = seats;
        engineSize = size;
        gearboxType = gearbox;
        fuelType = fuel;
        isConvertible = convertible;
        color = carColor;
    }

    // Setter method for the number of seats
    public void setNumberOfSeats(int seats) {
        numberOfSeats = seats;
    }

    
}

