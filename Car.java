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
 class car extends landVehicle {

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
     car(int headlights, int seats, float engineSize, String gearboxType, String fuelType, boolean isConvertible, String color) {

    }

    car(int headlights, int seats, float engineSize, boolean isConvertible) {
        this(headlights, seats, engineSize, "Automatic", "Petrol", isConvertible, "White");
    }

    /**
     * Default constructor for a car, using default values for all parameters.
     */
    car() {
        this(2, 4, 1.6f, "Automatic", "Petrol", false, "Red");
    }

    // Getter methods, inherited from landVehicle

    /**
     * @return engineSize <br>Returns a float indicating engine capacity in cc
     */
     float GetEngineSize() {
        return GetEngineSize();
    }

     String GetGearboxType() {
        return GetGearboxType();
    }

     String GetFuelType() {
        return GetFuelType();
    }

     boolean isConvertible() {
        return getIsConvertible();
    }

     String GetColor() {
        return GetColor();
    }

    // Setter methods
     void SetValue(float Value) {
    }

     float GetValue() {
        return 0.0f;
    }


 String ToString() {
    String tempString = "Car Details:\n";
    tempString += "Color: " + getColor() + "\n";
    tempString += "Headlights: " + getHeadlights() + "\n";
    tempString += "Number of Seats: " + getSeats() + "\n";
    tempString += "Engine Size: " + getEngineSize() + " cc\n";
    tempString += "Gearbox Type: " + getGearboxType() + "\n";
    tempString += "Fuel Type: " + getFuelType() + "\n";
    tempString += "Convertible: " + (isConvertible() ? "Yes" : "No") + "\n";
    tempString += "Superclass Details: " + ToString();

    return tempString;
    } // ends toString method
}     // ends car class declaration