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
    public ship(string name){
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
}
