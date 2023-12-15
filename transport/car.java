/**
 * Represents a car, inheriting from the landVehicle class.
 *
 * @author Armand Ediae B00147794@mytudublin.ie
 * @version 20231511 1313
 * @see truck
 * @see landVehicle
 * @see vehicle
 * @see motorbike
 * @since 1
 */
public class car extends landVehicle implements subjectToNCT {

    /**
     * Constructs a car with specified parameters.
     *
     * @param headlights   Number of headlights
     * @param seats        Number of seats
     * @param engineSize   Size of the car's engine
     * @param gearboxType  Type of gearbox (e.g., Automatic, Manual)
     * @param fuelType     Type of fuel the car uses
     * @param isConvertible Indicates if the car is convertible
     * @param color        Color of the car
     */
    public car(int headlights, int seats, float engineSize, String gearboxType, String fuelType, boolean isConvertible, String color) {
        // super(headlights, seats, fuelType, engineSize, gearboxType, color, isConvertible);
    }

    public car(int headlights, int seats, float engineSize, boolean isConvertible) {
        this(headlights, seats, engineSize, "Automatic", "Petrol", isConvertible, "White");
    }

    /**
     * Default constructor for a car, using default values for all parameters.
     */
    public car() {
        this(2, 4, 1.6f, "Automatic", "Petrol", false, "Red");
    }

    // Getter methods, inherited from landVehicle

    /**
     * @return engineSize <br>Returns a float indicating engine capacity in cc
     */
    public float getEngineSize() {
        return super.getEngineSize();
    }

    public String getGearboxType() {
        return super.getGearboxType();
    }

    public String getFuelType() {
        return super.getFuelType();
    }

    public boolean isConvertible() {
        return super.getIsConvertible();
    }

    public String getColor() {
        return super.getColor();
    }

    // Setter methods
    public void setValue(float value) {
    }

    public float getValue() {
        return 0.0f;
    }


public String toString() {
    String tempString = "Car Details:\n";
    tempString += "Color: " + getColor() + "\n";
    tempString += "Headlights: " + getHeadlights() + "\n";
    tempString += "Number of Seats: " + getSeats() + "\n";
    tempString += "Engine Size: " + getEngineSize() + " cc\n";
    tempString += "Gearbox Type: " + getGearboxType() + "\n";
    tempString += "Fuel Type: " + getFuelType() + "\n";
    tempString += "Convertible: " + (isConvertible() ? "Yes" : "No") + "\n";
    tempString += "Superclass Details: " + super.toString();

    return tempString;
    } // ends toString method
}     // ends car class declaration