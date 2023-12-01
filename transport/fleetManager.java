/**
Application to test the creation and management of a fleet of vehicles<br>
class fleet manager will be used to create and manuipulate a number of objects all extended from the super class vehicle <br>

@author Mark Deegan <a href="mailto:mark.deegan@tudublin.ie">Send Mail</a>
@version 202311171036
@see vehicle
*/
public class fleetManager 
{ // start declaration of the fleetManager class
	/** main method thjat will test the creation and management of some vehicles */
	public static void main(java.lang.String[] args)
	{ // begin declaration of the main method
		waitASecond();
		clearScreen();
		waitASecond();
		System.out.println("Hello. I am the fleet manager");
		System.out.println("I am going to create some instances of vehicles.");
		System.out.println("These will all be instances of classes derived from the superclass (base class) vehicle");

		waitASecond();
		waitASecond();
		System.out.println("Let's wait a little, and pretend this takes a while to complete...");
		waitASecond();
		waitASecond();
		System.out.println("processing your order...");
		waitASecond();
		waitASecond();
		System.out.println("Done!");
		waitASecond();
		waitASecond();


		car myCar 		= new car();		// create an anonymous car (no parameters)
		truck myTruck 		= new truck();		// create an anonymous truck (no parameters)
		motorbike myMotorbike 	= new motorbike();	// create an anonymous motorbike (no parameters)
		plane myPlane		= new plane(200, 16, "Aer Lingus"); // create a plane with 200 economy and 16 first-class seats
		hotAirBalloon myHAB	= new hotAirBalloon();	// create an anonymous hotAirBalloon (no parameters)
		helicopter myHelicopter	= new helicopter();	// create an anonymous helicopter (no parameters)
		
		System.out.println("Now that we have created them, we will print them out");
			waitASecond();
		System.out.println(myCar);
			waitASecond();
		System.out.println(myTruck);
			waitASecond();
		System.out.println(myMotorbike);
			waitASecond();
		System.out.println(myPlane);
			waitASecond();

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

	public static void waitASecond()
	{ // start waitASecond method
		try 
		{ // start try block
            		Thread.sleep(1000);
        	} // end try block
		catch (InterruptedException e) 
		{ // start catch block
            		e.printStackTrace();
        	} // 
	} // end waitASecond method

} // end declaration of the fleetManager class
