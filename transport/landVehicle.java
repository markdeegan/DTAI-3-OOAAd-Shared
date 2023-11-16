/** paddy kelly 9.11.2023.11:44 vehicle*/
// Description: This class represents a land vehicle and extends the vehicle class.

public class landVehicle extends vehicle {

    // Declare private instance variables for landVehicle class
    private int numberOfTyres;
    private int amountOfCylindersInTheEngine;
    private int numberOfDoors;
    private int numberOfSeats;
    private int sizeOfFuelTank;
    private int amountOfTreads;
    private int numberOfExhausts;
    private int numberOfWindows;
    private int numberOfAxles;
    private int numberOfHeadlights;

    // Constructor with some parameters
    public landVehicle(int axles, int headlights, int seats) {
        numberOfHeadlights = headlights;
        numberOfSeats = seats;
        numberOfAxles = axles;
    }

    // Getter methods for retrieving the values of private instance variables

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public int getAmountOfCylindersInTheEngine() {
        return amountOfCylindersInTheEngine;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getSizeOfFuelTank() {
        return sizeOfFuelTank;
    }

    public int getAmountOfTreads() {
        return amountOfTreads;
    }

    public int getNumberOfExhausts() {
        return numberOfExhausts;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public int getNumberOfHeadlights() {
        return numberOfHeadlights;
    }

    // Setter methods for setting the values of private instance variables

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public void setAmountOfCylindersInTheEngine(int amountOfCylinders) {
        amountOfCylindersInTheEngine = amountOfCylinders;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setSizeOfFuelTank(int sizeOfFuelTank) {
        this.sizeOfFuelTank = sizeOfFuelTank;
    }

    public void setAmountOfTreads(int amountOfTreads) {
        this.amountOfTreads = amountOfTreads;
    }

    public void setNumberOfExhausts(int numberOfExhausts) {
        this.numberOfExhausts = numberOfExhausts;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public void setNumberOfHeadlights(int numberOfHeadlights) {
        this.numberOfHeadlights = numberOfHeadlights;
    }
}
