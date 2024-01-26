//
//
//plane class
/**
@author Mansur Niniola B00@mytudublin.ie
@version 202315111033
@see ship
@see airVehicle
@see vehicle
*/

/** declare the public class plane extends from the class airvehicle */
public class plane extends airVehicle {

  //begin declaration of private instance variables for plane class
  private int seat_number;
  private int firstClassSeats; /** Number of first-class seats */
  private int economyClassSeats; // Number of economy-class seats
  private float maxAltitude; // Maximum flying altitude
  private float range; // Maximum range the plane can travel
  private float wingSpan; // The wingspan of the plane
  private float cargoCapacity; // Maximum cargo capacity
  private String airline; // Associated airline

/** basic constructor to set the most essential attributes of a plane
<br>
MD20231116-1011 Fixed the naming of this constructor. */
public plane(int seat_number, float maxAltitude, String airline) {
    this.seat_number = seat_number;
    this.maxAltitude = maxAltitude;
    this.airline = airline;
}
  /** for setting up planes with specific numbers
  <br>
  of first-class and economy-class seats. */
  public plane(int firstClassSeats, int economyClassSeats, String airline) {
      this.firstClassSeats = firstClassSeats;
      this.economyClassSeats = economyClassSeats;
      this.airline = airline;
}
//full detail constructor with every attribute of the plane
// MD20231116-1011 Fixed the naming of this constructor.
  public plane(int seat_number, int firstClassSeats, int economyClassSeats, float maxAltitude,
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
// constructor with range and capacity
// for when a plane's range and cargo capacity, mainly used for cargo and long haul flights
// MD20231116-1011 Fixed the naming of this constructor.

  public plane(float range, float cargoCapacity, String airline) {
    this.range = range;
    this.cargoCapacity = cargoCapacity;
    this.airline = airline;
}
  // Getters
    public int getSeatNumber() {
        return seat_number;
    }

    public int getFirstClassSeats() {
        return firstClassSeats;
    }

    public int getEconomyClassSeats() {
        return economyClassSeats;
    }

    public float getMaxAltitude() {
        return maxAltitude;
    }

    public float getRange() {
        return range;
    }

    public float getWingSpan() {
        return wingSpan;
    }

    public float getCargoCapacity() {
        return cargoCapacity;
    }

    public String getAirline() {
        return airline;
    }

  // Setters
    public void setSeatNumber(int seatNumber) {
        this.seat_number = seat_number;
    }

    public void setFirstClassSeats(int seats) {
        this.firstClassSeats = seats;
    }

    public void setEconomyClassSeats(int seats) {
        this.economyClassSeats = seats;
    }

    public void setMaxAltitude(float altitude) {
        this.maxAltitude = altitude;
    }

    public void setRange(float range) {
        this.range = range;
    }

    public void setWingSpan(float wingSpan) {
        this.wingSpan = wingSpan;
    }

    public void setCargoCapacity(float capacity) {
        this.cargoCapacity = capacity;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String toString() { // using the to string method to create a string represntation of this class which is plane
        String result = "Plane Details:\n"; // creating a variable called results which begins the string representation of the plane class
        result += "Airline: " + airline + "\n";// appending the name of the airline to the variable called results but on a newline
        result += "Total Seats: " + seat_number + "\n";// apppending the total number of seats on a plane on a new line
        result += "First Class Seats: " + firstClassSeats + "\n";// appendining the number of first class seats
        result += "Economy Class Seats: " + economyClassSeats + "\n";// appending the number of economy class seats
        result += "Max Altitude: " + maxAltitude + " meters\n";// appending the maximum altitude of the plane in meteres
        result += "Range: " + range + " km\n";// appending the range of the plane, indicating how far it can travel, including the unit.
        result += "Wing Span: " + wingSpan + " meters\n";  // appending the wingspan of the plane, including the unit
        result += "Cargo Capacity: " + cargoCapacity + " kg\n";// Appends the cargo capacity of the plane, including the unit 
        return result;// returning the value of the variable result
    }
}
