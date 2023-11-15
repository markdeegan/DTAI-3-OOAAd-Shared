
/**
 * Armand Ediae
 * 20231110 1149
 * car class
 */
public class car extends landVehicle {

    private int numberOfHeadlights;
    private int numberOfSeats;
    private float engineSize;
    private String gearboxType;
    private String fuelType;
    private boolean isConvertible;
    private String color;

    // Full constructor
    public car(int headlights, int seats, float size, String gearbox, String fuel, boolean convertible, String carColor) {
        numberOfHeadlights = headlights;
        numberOfSeats = seats;
        engineSize = size;
        gearboxType = gearbox;
        fuelType = fuel;
        isConvertible = convertible;
        color = carColor;
    }

    // Constructor with some parameters
    public car(int headlights, int seats, float size, boolean convertible) {
        this(headlights, seats, size, "Automatic", "Petrol", convertible, "White"); // Default values for gearbox, fuel, and color
    }

    // Default constructor with no parameters
    public car() {
        this(2, 4, 1.6f, "Automatic", "Petrol", false, "Red"); // Default values for all parameters
    }

    // Getter methods
    public int getNumberOfHeadlights() {
        return numberOfHeadlights;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public String getColor() {
        return color;
    }

    // Setter methods
    public void setNumberOfHeadlights(int numberOfHeadlights) {
        this.numberOfHeadlights = numberOfHeadlights;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
