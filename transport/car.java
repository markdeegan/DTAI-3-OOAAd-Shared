/**
 * Represents a car, inheriting from the landVehicle class.
 * 
 * @author Armand Ediae
 * @version 20231511 1313
 */
public class Car extends LandVehicle {

    private float engineSize;
    private String gearboxType;
    private String fuelType;
    private boolean isConvertible;
    private String color;

    /**
     * Constructs a car with specified parameters.
     * 
     * @param headlights Number of headlights
     * @param seats Number of seats
     * @param engineSize Size of the car's engine
     * @param gearboxType Type of gearbox (e.g., Automatic, Manual)
     * @param fuelType Type of fuel the car uses
     * @param isConvertible Indicates if the car is convertible
     * @param color Color of the car
     */
    public Car(int headlights, int seats, float engineSize, String gearboxType, String fuelType, boolean isConvertible, String color) {
        super(headlights, seats); // Assuming a constructor in landVehicle that accepts headlights and seats
        this.engineSize = engineSize;
        this.gearboxType = gearboxType;
        this.fuelType = fuelType;
        this.isConvertible = isConvertible;
        this.color = color;
    }

    /**
     * Constructs a car with specified parameters, using default values for gearbox, fuel, and color.
     * 
     * @param headlights Number of headlights
     * @param seats Number of seats
     * @param engineSize Size of the car's engine
     * @param isConvertible Indicates if the car is convertible
     */
    public Car(int headlights, int seats, float engineSize, boolean isConvertible) {
        this(headlights, seats, engineSize, "Automatic", "Petrol", isConvertible, "White");
    }

    /**
     * Default constructor for a car, using default values for all parameters.
     */
    public Car() {
        this(2, 4, 1.6f, "Automatic", "Petrol", false, "Red");
    }

    // Getter methods, inherited from landVehicle

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

    // 
}
