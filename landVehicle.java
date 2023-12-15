/** paddy kelly 9.11.2023.11:44 vehicle*/
// Description: This class represents a land vehicle and extends the vehicle class.

 class landVehicle extends Vehicle {

    private int seats;
    private float engineSize;
    private String gearboxType;
    private String fuelType;
    private boolean isConvertible;
    private String color;
    private int headlights;

    // Constructor with parameters
     landVehicle(int seats, float engineSize, String gearboxType, String fuelType, boolean isConvertible, String color, int headlights) {

        this.seats = seats;
        this.engineSize = engineSize;
        this.gearboxType = gearboxType;
        this.fuelType = fuelType;
        this.isConvertible = isConvertible;
        this.color = color;
        this.headlights = headlights;
    }

    // Default constructor with no parameters
     landVehicle() {
        // Default constructor with no parameters
    }

    // Getter methods
     int getSeats() {
        return seats;
    }

     float getEngineSize() {
        return engineSize;
    }

     String getGearboxType() {
        return gearboxType;
    }

     String getFuelType() {
        return fuelType;
    }

     boolean getIsConvertible() {
        // MD20231201 renamed this method from isConvertible (which is the same as the name of the variable, to getIsConvertible()
        // that makes sense anyway, as this is a getter method, and our convention is to name all getter methods so they start with get.
        return isConvertible;
    }

     String getColor() {
        return color;
    }

     int getHeadlights() {
        return headlights;
    }

    // Setter methods
     void setSeats(int seats) {
        this.seats = seats;
    }

     void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

     void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

     void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

     void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

     void setColor(String color) {
        this.color = color;
    }

   void setHeadlights(int headlights) {
        this.headlights = headlights;
    }
}