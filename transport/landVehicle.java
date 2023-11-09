/** paddy kelly 9.11.2023.11:44 vehicle*/
// Description: This class represents a land vehicle and extends the vehicle class.

public class landVehicle extends vehicle

{
// Declare private instance variables for landVehicle class
  private int numberOfTyres;
  private int amountOfCylindersInTheEngine;
  private int numberOfDoors;
  private int numberOfSeats;
  private int sizeOfFuelTank;
///  private int numberOfWings;
// Setter method for setting the number of tyres
  public void setNumberOfTyres(int nOT)
  {
    numberOfTyres = nOT;
  }
// Setter method for setting the amount of cylinders in the engine
  public void setAmountOfCylinders(int cylinders) 
  {
    amountOfCylindersInTheEngine = cylinders;
  }
// Setter method for setting the number of doors
  public void setNumberOfDoors(int doors) 
  {
    numberOfDoors = doors;
  }
// Setter method for setting the number of seats
  public void setNumberOfSeats(int seats)
  {
    numberOfSeats = seats;
  }
// Setter method for setting the size of the fuel tank
  public void setSizeOfFuelTank(int sOT)
  {
    sizeOfFuelTank = sOT;
  }
} // end declaration of class landVehicle
