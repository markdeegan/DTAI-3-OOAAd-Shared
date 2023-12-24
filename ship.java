//Mansur Niniola
//2023.15.11.14:53
//ship class


//declare the public class ship extends from the class watervehicle
  public class ship extends waterVehicle{
    private String name; //name of the ship
    private float length; //length of the ship in meters
    private float beam; //width of the ship at its widest point
    private float weight; //the ship's weight
    private int crewSize; //number of crew members
    private int passengerCapacity;//how many passangers it can carry
    private float maxSpeed;//maximum speed of the ships

  //creating a basic constructor
    public ship(String name){
      this.name = name;
    }

  //creating a constructor with only name and size details
  // MD20231116-1014 fixed this to name String not string
    public ship(String name, float length, float beam){
      this.name = name;
      this.length = length;
      this.beam = beam;
    }

  //creating a cunstructor with all attributes of the class ship
	// MD20231116-1014 fixed this to name String not string

    public ship(String name, float length, float beam, float weight, int crewSize, int passengerCapacity, float maxSpeed){
      this.name = name;
      this.length = length;
      this.beam = beam;
      this.weight = weight;
      this.crewSize = crewSize;
      this.passengerCapacity = passengerCapacity;
      this.maxSpeed = maxSpeed;

    }

	      // Getter method for 'name'.
      public String getName() {
        return name; // Returns the name of the ship.
    }

    // Getter method for 'length'.
    public float getLength() {
        return length; // Returns the length of the ship.
    }

    // Getter method for 'beam'.
    public float getBeam() {
        return beam; // Returns the beam (width) of the ship.
    }

    // Getter method for 'weight'.
    public float getWeight() {
        return weight; // Returns the weight of the ship.
    }

    // Getter method for 'crewSize'.
    public int getCrewSize() {
        return crewSize; // Returns the number of crew members.
    }

    // Getter method for 'passengerCapacity'.
    public int getPassengerCapacity() {
        return passengerCapacity; // Returns the passenger capacity.
    }

    // Getter method for 'maxSpeed'.
    public float getMaxSpeed() {
        return maxSpeed; // Returns the maximum speed of the ship.
    }

    // Setter method for 'name'.
    public void setName(String name) {
        this.name = name; // Sets the name of the ship.
    }

    // Setter method for 'length'.
    public void setLength(float length) {
        this.length = length; // Sets the length of the ship.
    }

    // Setter method for 'beam'.
    public void setBeam(float beam) {
        this.beam = beam; // Sets the beam (width) of the ship.
    }

    // Setter method for 'weight'.
    public void setWeight(float weight) {
        this.weight = weight; // Sets the weight of the ship.
    }

    // Setter method for 'crewSize'.
    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize; // Sets the number of crew members.
    }

    // Setter method for 'passengerCapacity'.
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity; // Sets the passenger capacity.
    }

    // Setter method for 'maxSpeed'.
    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed; // Sets the maximum speed of the ship.
    }

    public String toString() {// using the to string method to create a string represntation of this class which is ship
      String value = "Ship details: \n";// creating a variable called value which begins the string reperesentation of the ship class
      value += "name: " + name +"\n";
      value += "length: " + length + "\n";
      value += "beam: " + beam + "\n";
      value += "weight: " + weight + "\n";
      value += "crew size: " + crewSize + "\n";
      value += "passenger capacity " + passengerCapacity + "\n";
      return value;




    }
}
