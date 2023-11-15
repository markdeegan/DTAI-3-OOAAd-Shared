/** 
Paddy Kelly 
9.11.2023.11:44 
class vehicle
*/
// Declare the public class airVehicle, extending the vehicle class
public class airVehicle extends vehicle
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
////////////////////////////////////////Setter method for setting the number of engines
public void setnumberOfEngens(int nOE)
  {
    numberOfEngens = nOE;
  }
////////////////////////////////////////Setter method for setting the number of tires
public void setnumberOfTires(int nOT)
  {
    numberOfTires = nOT;
  }
////////////////////////////////////////Setter method for setting the number of propellers
public void numberOfPropellers(int nOP)
  {
    numberOfPropellers = nOP;
  }
////////////////////////////////////////Setter method for setting the weight of the vehicle
public void weightOfVehicle(int wOV)
  {
    weightOfVehicle = wOV;
  }
////////////////////////////////////////Setter method for setting the number of seats
public void numberOfSeats(int nOS)
  {
    numberOfSeats = nOS;
  }
////////////////////////////////////////Setter method for setting the size of the fuel tank
public void sizeOfFuelTank(int sOT)
  {
    sizeOfFuelTank = sOT;
  }
////////////////////////////////////////Setter method for setting the number of lights
public void numberOfLights(int NOL)
  {
    numberOfLights = NOL;
      }
////////////////////////////////////////Setter method for setting the number of Axels
  public void NumberOfAxels(int NOA)
  { 
    NumberOfAxels = NOA;
  }
 public void NumberOfwings(int NOW)
 {
  NumberOfwings = NOW;
	}
} // end declaration of class airVehicle
