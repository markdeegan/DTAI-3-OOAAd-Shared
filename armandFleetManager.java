/**
 * Application to test the creation and management of a fleet of vehicles.
 * The fleetManager class is used to create and manipulate objects extended from the superclass vehicle.
 *
 * @author Armand Ediae <a href="mailto:B00147794@mytudublin.ie">Send Mail</a>
 * @version 202312061806
 * @see vehicle
 */
public class armandFleetManager {

    /**
     * Main method to test the creation and management of some vehicles.
     * Adjust constructor parameters for the truck instantiation.
     */
    public static void main(String[] args) {
        waitASecond(1);
        clearScreen();
        waitASecond(1);
        System.out.println("Hello. I am the fleet manager");
        System.out.println("I am going to create some instances of vehicles.");
        System.out.println("These will all be instances of classes derived from the superclass (base class) vehicle");

        waitASecond(2);
        System.out.println("Let's wait a little, and pretend this takes a while to complete...");
        waitASecond(2);
        System.out.println("Processing your order...");
        waitASecond(2);
        System.out.println("Done!");
        waitASecond(2);

        // Adjust the constructor parameters for the truck instantiation
        truck myTruck = new truck(1, 1, 1, 1.0f, "Example");
        motorbike myMotorbike = new motorbike();  // create an anonymous motorbike (no parameters)
        car myCar = new car();            // create an anonymous car (no parameters)

        // Placeholder for the missing classes
        // hotAirBalloon myHAB = new hotAirBalloon();  // create an anonymous hotAirBalloon (no parameters)
        // helicopter myHelicopter = new helicopter();  // create an anonymous helicopter (no parameters)

        System.out.println("Now that we have created them, we will print them out");
        waitASecond(1);
        System.out.println(myTruck);
        waitASecond(1);
        System.out.println(myMotorbike);
        waitASecond(1);
        System.out.println(myCar);

        // Placeholder for the missing classes
        // System.out.println(myHAB);
        // System.out.println(myHelicopter);

        System.out.println();
        System.out.println("All done!");
    }

    /**
     * Method to clear the screen (console) in a command-line application using escape sequences.
     */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Method to wait a fixed number of seconds.
     * Default value is 1 second; otherwise, seconds * 1000 milliseconds.
     */
    public static void waitASecond(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
