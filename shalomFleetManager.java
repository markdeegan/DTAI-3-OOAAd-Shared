/**
Application to test the creation and management of a fleet of vehicles<br>
class fleet manager will be used to create and manuipulate a number of objects all extended from the super class vehicle <br>

@author Shalom Olorunfemi
@version 1.0
@see vehicle
*/
public class shalomFleetManager
{ // start declaration of the shalomFleetManager class
	/** main method thjat will test the creation and management of some vehicles */
	public static void main(java.lang.String[] args)
	{ // begin declaration of the main method
		waitASecond(1);
		clearScreen();
		waitASecond(1);
		System.out.println("Hello. I am the fleet manager");
		System.out.println("I am going to create some instances of vehicles.");
		System.out.println("These will all be instances of classes derived from the superclass (base class) vehicle");

		waitASecond(2);
		System.out.println("Let's wait a little, and pretend this takes a while to complete...");
		waitASecond(2);
		System.out.println("processing your order...");
		waitASecond(2);
		System.out.println("Done!");
		waitASecond(2);


		// truck myTruck 		= new truck();		// create an anonymous truck (no parameters)
		motorbike myMotorbike 	= new motorbike();	// create an anonymous motorbike (no parameters)
		// car myCar 		= new car();		// create an anonymous car (no parameters)
		plane myPlane		= new plane(200, 16, "Aer Lingus"); // create a plane with 200 economy and 16 first-class seats
		hotAirBalloon myHAB	= new hotAirBalloon();	// create an anonymous hotAirBalloon (no parameters)
		// helicopter myHelicopter	= new helicopter();	// create an anonymous helicopter (no parameters)

		System.out.println("Now that we have created them, we will print them out");
			waitASecond(1);
		// System.out.println(myTruck);
		//	waitASecond(1);
		System.out.println(myMotorbike);
			waitASecond(1);
		// System.out.println(myCar);
		//	waitASecond(1);
		System.out.println(myPlane);
			waitASecond(1);

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
