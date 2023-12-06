/**
Application to test the creation and management of a fleet of vehicles<br>
class fleet manager 2 will be used to create and manuipulate a number of objects all extended from the super class vehicle <br>

@author Mark Deegan <a href="mailto:mark.deegan@tudublin.ie">Send Mail</a>
@version 202311171036
@see vehicle
*/

import java.util.ArrayList;

public class fleetManager2
{ // start declaration of the fleetManager2 class

	/** main method that will test the creation and management of some vehicles */
	public static void main(java.lang.String[] args)
	{ // begin declaration of the main method

	ArrayList<vehicle> myFleet = new ArrayList<vehicle>();	
		waitASecond(1);
		clearScreen();

		truck myTruck 		= new truck();		// create an anonymous truck (no parameters)
			myFleet.add(myTruck);
		motorbike myMotorbike 	= new motorbike();	// create an anonymous motorbike (no parameters)
			myFleet.add(myMotorbike);
		car myCar 		= new car();		// create an anonymous car (no parameters)
			myFleet.add(myCar);
		plane myPlane		= new plane(200, 16, "Aer Lingus"); // create a plane with 200 economy and 16 first-class seats
			myFleet.add(myPlane);
		hotAirBalloon myHAB	= new hotAirBalloon();	// create an anonymous hotAirBalloon (no parameters)
			myFleet.add(myHAB);
		helicopter myHelicopter	= new helicopter();	// create an anonymous helicopter (no parameters)
			myFleet.add(myHelicopter);
		
		System.out.println("Now that we have created them, we will print them out");
			waitASecond(1);

    		for (int i = 0; i < myFleet.size(); i++) {
      			System.out.println(myFleet.get(i));
		}

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
