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
  private int amountOfTredds;
  private int numberOfExustes;
  private int numberOfWindows;
  private int numberofAxles;
  private int numberofHeadlights,
// Setter method for setting the number of tyres
  public void setNumberOfTyres(int nOT)
  {
    numberOfTyres = nOT;
     }
    // Constructor with some parameters
    public landVehicle(int axles, int headlights, int seats) {
       numberOfHeadlights = headlights;
       numberOfSeats = seats;
       numberOfAxles = axles;
       
    }
  }
// Setter method for setting the amount of cylinders in the engine
  public void setAmountOfCylinders(int AOC) 
  {
    amountOfCylindersInTheEngine = AOC;
  }
// Setter method for setting the number of doors
  public void setNumberOfDoors(int NOD) 
  {
    numberOfDoors = NOD;
  }
// Setter method for setting the number of seats
  public void setNumberOfSeats(int NOS)
  {
    numberOfSeats = NOS;
  }
// Setter method for setting the size of the fuel tank
  public void setSizeOfFuelTank(int sOT)
  {
    sizeOfFuelTank = sOT;
  }
  // Setter method for setting the amount of Tredds on a veicle 
  public void amountOfTredds(int aOT)
  {
    amountOfTredds = aOT;
  }
    // Setter method for setting the number of exaustests  
  public void numberOfExaustests(int nOE)
  {
    numberOfExustes = nOE;
  }
  // Setter method for setting the number of windows
  public void numberOfWindows(int nOW)
  {
  numberOfWindows = nOW;
    }
} // end declaration of class landVehicle
