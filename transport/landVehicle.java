/** paddy kelly 9.11.2023.11:44 vehicle*/
// Description: This class represents a land vehicle and extends the vehicle class.

public class landVehicle extends vehicle {

    private float engineSize;
    private String gearboxType;
    private String fuelType;
    private boolean isConvertible;
    private String color;

    // Constants for default values
    private static final int DEFAULT_HEADLIGHTS = 2;
    private static final int DEFAULT_SEATS = 4;
    private static final float DEFAULT_ENGINE_SIZE = 1.6f;
    private static final String DEFAULT_GEARBOX_TYPE = "Automatic";
    private static final String DEFAULT_FUEL_TYPE = "Petrol";
    private static final boolean DEFAULT_IS_CONVERTIBLE = false;
    private static final String DEFAULT_COLOR = "Red";

    // Full constructor
    /* public car(int headlights, int seats, float size, String gearbox, String fuel, boolean convertible, String carColor) {
        super(headlights, seats);
        engineSize = size;
        gearboxType = gearbox;
        fuelType = fuel;
        isConvertible = convertible;
        color = carColor;
    }*/

    // Constructor with some parameters
    /* public Car(int headlights, int seats, float size, boolean convertible) {
        this(headlights, seats, size, DEFAULT_GEARBOX_TYPE, DEFAULT_FUEL_TYPE, convertible, DEFAULT_COLOR);
    } */

    // Default constructor with no parameters
    /* public Car() {
        this(DEFAULT_HEADLIGHTS, DEFAULT_SEATS, DEFAULT_ENGINE_SIZE, DEFAULT_GEARBOX_TYPE, DEFAULT_FUEL_TYPE, DEFAULT_IS_CONVERTIBLE, DEFAULT_COLOR);
    } */

    // Getter methods, inherited from LandVehicle

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
