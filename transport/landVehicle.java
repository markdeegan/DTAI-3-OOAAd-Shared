/** paddy kelly 9.11.2023.11:44 vehicle*/
// Description: This class represents a land vehicle and extends the vehicle class.

public abstract class landVehicle extends vehicle {

    private int seats;
    private float engineSize;
    private String gearboxType;
    private String fuelType;
    private boolean isConvertible;
    private String color;
    private int headlights;

    // Constructor with parameters
    public landVehicle(int seats, float engineSize, String gearboxType, String fuelType, boolean isConvertible, String color, int headlights) {
        
        this.seats = seats;
        this.engineSize = engineSize;
        this.gearboxType = gearboxType;
        this.fuelType = fuelType;
        this.isConvertible = isConvertible;
        this.color = color;
        this.headlights = headlights;
    }

    // Default constructor with no parameters
    public landVehicle() {
        // Default constructor with no parameters
    }

    // Getter methods
    public int getSeats() {
        return seats;
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

    public boolean getIsConvertible() {
        // MD20231201 renamed this method from isConvertible (which is the same as the name of the variable, to getIsConvertible()
        // that makes sense anyway, as this is a getter method, and our convention is to name all getter methods so they start with get.
        return isConvertible;
    }

    public String getColor() {
        return color;
    }

    public int getHeadlights() {
        return headlights;
    }

    // Setter methods
    public void setSeats(int seats) {
        this.seats = seats;
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

    public void setHeadlights(int headlights) {
        this.headlights = headlights;
    }
}
