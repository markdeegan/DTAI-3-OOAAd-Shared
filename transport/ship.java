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
    public ship(sting nmae, float length, float beam){
      this.name = name;
      this.length = length;
      this.beam = beam
    }
}
