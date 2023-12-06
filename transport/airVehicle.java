/**
Paddy Kelly
9.11.2023.11:44
class vehicle
*/
// Declare the public class airVehicle, extending the vehicle class
public abstract class airVehicle extends vehicle
{
  // begin declaration of private instance variables for airVehicle class
  private int numberOfEngens;
  private int numberOfTires;
  private int numberOfPropellers;
  private int weightOfVehicle;
  private int numberOfSeats;
  private int sizeOfFuelTank;
  private int numberOfLights;
  private int NumberOfAxels;
  private int NumberOfwings;

  //Constructor created by Eoin Finnerty 20231116 1143.
  //Needed for constructors in helicopter & hotAirBalloon to work.
  //Given permission by Mark.
  public airVehicle(int engines, int tires, int propellers, int weight, int seats, int fuelTank, int lights, int axels, int NumberOfwings){
	  numberOfEngens = engines;
	  numberOfTires = tires;
	  numberOfPropellers = propellers;
	  weightOfVehicle = weight;
	  numberOfSeats = seats;
	  sizeOfFuelTank = fuelTank;
	  numberOfLights = lights;
	  NumberOfAxels = axels;
	  this.NumberOfwings = NumberOfwings;
	  //Here this.NumberOfwings refers to the class member NumberOfwings. NumberOfwings without the "this." refers to the parameter of the same name.
  }

  //Default constructor
  public airVehicle() {
  }

//Changes made to parameters in setter methods by Eoin Finnerty 20231116 1204.
//Did this so that the parameters would reflect those I created in the constructor.
//Done so that I may better understand the code and to make it easier for me to write my code.
//Give permission by Mark.
////////////////////////////////////////Setter method for setting the number of engines
public void setnumberOfEngens(int engines)
  {
    numberOfEngens = engines;
  }
////////////////////////////////////////Setter method for setting the number of tires
public void setnumberOfTires(int tires)
  {
    numberOfTires = tires;
  }
////////////////////////////////////////Setter method for setting the number of propellers
public void numberOfPropellers(int propellers)
  {
    numberOfPropellers = propellers;
  }
////////////////////////////////////////Setter method for setting the weight of the vehicle
public void weightOfVehicle(int weight)
  {
    weightOfVehicle = weight;
  }
////////////////////////////////////////Setter method for setting the number of seats
public void numberOfSeats(int seats)
  {
    numberOfSeats = seats;
  }
////////////////////////////////////////Setter method for setting the size of the fuel tank
public void sizeOfFuelTank(int fuelTank)
  {
    sizeOfFuelTank = fuelTank;
  }
////////////////////////////////////////Setter method for setting the number of lights
public void numberOfLights(int lights)
  {
    numberOfLights = lights;
      }
////////////////////////////////////////Setter method for setting the number of Axels
  public void NumberOfAxels(int axels)
  {
    NumberOfAxels = axels;
  }
 public void NumberOfwings(int NumberOfwings)
 {
  this.NumberOfwings = NumberOfwings;
	}
} // end declaration of class airVehicle
