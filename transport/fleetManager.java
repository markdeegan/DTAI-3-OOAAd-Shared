/**
Application to test the creation and management of a fleet of vehicles<br>
class fleet manager will be used to create and manuipulate a number of objects all extended from the super class vehicle <br>

@author Mark Deegan <a href="mailto:mark.deegan@tudublin.ie">
@version 202311171036
@see vehicle
*/
public class fleetManager 
{ // start declaration of the fleetManager class
	/** main method thjat will test the creation and management of some vehicles */
	public static void main(java.lang.String[] args)
	{ // begin declaration of the main method
		System.out.println("Hello. I am the fleet manager");

		car myCar 		= new car();		// create an anonymous car (no parameters)
		truck myTruck 		= new truck();		// create an anonymous truck (no parameters)
		motorbike myMotorbike 	= new motorbike();	// create an anonymous motorbike (no parameters)
		plane myPlane		= new plane(200, 16, "Aer Lingus"); // create a plane with 200 economy and 16 first-class seats
		hotAirBalloon myHAB	= new hotAirBalloon();	// create an anonymous hotAirBalloon (no parameters)
		helicopter myHelicopter	= new helicopter();	// create an anonymous helicopter (no parameters)
		


	} // end declaration of the main method
} // end declaration of the fleetManager class
