import java.util.ArrayList;

/**
Application to test the creation and management of a fleet of vehicles<br>
class fleet manager 2 will be used to create and manuipulate a number of objects all extended from the super class vehicle <br>
@author Eoin Finnerty <a href="mailto:b00143526@mytudublin.ie">Send Mail</a>
@version 20231213 2219
@see vehicle
@see hotAirBalloon
@see helicopter
*/
public class fleetManager2
{ // start declaration of the fleetManager2 class

	/** main method that will test the creation and management of some vehicles */
	public static void main(java.lang.String[] args)
	{ // begin declaration of the main method

	/** declare an ArrayList to store objects of class vehicle etc. */
	ArrayList<vehicle> myFleet = new ArrayList<vehicle>();

	/** declare an ArrayList to store objects of class helicopter*/
	ArrayList<car> myCars = new ArrayList<helicopter>();

	/** declare an ArrayList to store objects of class hotAirBalloon*/
	ArrayList<car> myCars = new ArrayList<helicopter>();


	clearScreen();

	System.out.println("Creating some instances of vehicles");
	System.out.println();
	waitASecond(1);


		hotAirBalloon myHotAirBalloon = new hotAirBalloon();	// create an anonymous hotAirBalloon (no parameters)
			myFleet.add(myHAB);			// add the Hot Air Balloon to the fleet
		helicopter myHelicopter	= new helicopter();	// create an anonymous helicopter (no parameters)
			myFleet.add(myHelicopter);		// add the helicopter to the fleet

		System.out.println("Now that we have created them, we will print them out");
			waitASecond(1);

		System.out.println("Printing out all vehicles.");
		// loop through, from i = 0 to i < myFleetSize
    		for (int i = 0; i < myFleet.size(); i++) {
			// just print out the object, relying on the toString method
      			System.out.println(myFleet.get(i));
		}
		System.out.println();
		waitASecond(1);

		System.out.println("Adding cars only to myHotAirBalloon container");
    		for (int j = 0; j < myFleet.size(); j++) {
			// check if the object is of class hotAirBalloon,
			// if it is, add it to the myHotAirBalloon array container
			vehicle currentVehicle = myFleet.get(j);
			if (currentVehicle instanceof hotAirBalloon)
			{
				System.out.println(currentVehicle + " is an instance of class hotAirBalloon");
				System.out.println("So, let's add it to the myHotAirBalloon ArrayList.");
				System.out.println();
				myHotAirBalloon.add((hotAirBalloon)currentVehicle);
			}
			else {

				System.out.println(currentVehicle + " is not an instance of class hotAirBalloon");
				System.out.println("So, we won't be adding it to the myHotAirBalloon arrayList.");
				System.out.println();
			}
		}
		System.out.println();
		waitASecond(1);

		System.out.println("Printing out only hotAirBalloon.");
		// loop through, from i = 0 to i < myhotAirBalloonSize
    		for (int k = 0; k < myHotAirBalloon.size(); k++) {
			// just print out the object, relying on the toString method
			hotAirBalloon currentHotAirBalloon = myHotAirBalloon.get(k);
      			System.out.println(currentHotAirBalloon);
		}
		System.out.println(myFleet);
		System.out.println(myHotAirBalloon);

		System.out.println();
		System.out.println("All done!");

	} // end declaration of the main method

	/** method to clear screen (console) in a command-line application iusing escape sequences<br>
	\033[H: It moves the cursor at the top left corner of the screen or console.<br>
	\033[2J: It clears the screen from the cursor to the end of the screen. */
	public static void clearScreen()
	{
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	/** waitASecond method to wait a fixed number of seconds
	default value, 1 second, otherwise seconds*1000 milliseconds */
	public static void waitASecond(int seconds) /** method to wait a while, using the Thread.sleep() method<br>
 	Because that method can throw exceptions, we need to wrap the call to Thread.sleep() in a <br>
  	try/catch block as below.*/
	{ // start waitASecond method
		try
		{ // start try block
            		Thread.sleep(seconds * 1000);
        	} // end try block
		catch (InterruptedException e)
		{ // start catch block
            		e.printStackTrace();
        	} //
	} // end waitASecond method

} // end declaration of the fleetManager class
