//Mansur Niniola
//202315111033
//plane class

public class plane extends airVehicle {
  
  private int seat_number;
  private int firstClassSeats; // Number of first-class seats
  private int economyClassSeats; // Number of economy-class seats
  private float maxAltitude; // Maximum flying altitude
  private float range; // Maximum range the plane can travel
  private float wingSpan; // The wingspan of the plane
  private float cargoCapacity; // Maximum cargo capacity
  private String airline; // Associated airline

  // basic constructor to set the most essential attributes of a plane
   public Plane(int seat_number, float maxAltitude, String airline) {
    this.seat_number = seat_number;
    this.maxAltitude = maxAltitude;
    this.airline = airline;
}
  // constructor with class specific seats
  // for setting up planes with specific numbers of first-class and economy-class seats.
  public Plane(int firstClassSeats, int economyClassSeats, String airline) {
      this.firstClassSeats = firstClassSeats;
      this.economyClassSeats = economyClassSeats;
      this.airline = airline;
}
//full detail constructor to set every attribute of the plane
  public Plane(int seat_number, int firstClassSeats, int economyClassSeats, float maxAltitude, 
             float range, float wingSpan, float cargoCapacity, String airline) {
    this.seat_number = seat_number;
    this.firstClassSeats = firstClassSeats;
    this.economyClassSeats = economyClassSeats;
    this.maxAltitude = maxAltitude;
    this.range = range;
    this.wingSpan = wingSpan;
    this.cargoCapacity = cargoCapacity;
    this.airline = airline;
}

