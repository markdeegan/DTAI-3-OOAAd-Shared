//Mansur Niniola
//202315111033
//plane class

public class plane extends airVehicle {
  
  private int seat_number;
  private int numberOfEngines;
  private int numberOfTires;
  private string fuelType;
  private double maxAltitude; // Maximum flying altitude
  private double range; // Maximum range the plane can travel
  private double wingSpan; // The wingspan of the plane
  private double cargoCapacity; // Maximum cargo capacity
  private String airline; // Associated airline

    public plane(int numberOfEngines, int seat_number, int numberOfTires, String fuelType) {
        super();
        this.numberOfEngines = numberOfEngines;
        this.seatNumber = seatNumber;
        this.numberOfTires = numberOfTires;
        this.setFuelType(fuelType); 
    }
}
