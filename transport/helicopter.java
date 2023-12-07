/**
@author Eoin Finnerty B00143526@mytudublin.ie
@version Thursday 20231123 1207
@see hotAirBalloon
@see plane
@see airVehicle
@see vehicle
This is to create class helicopter which extends class airVehicle
*/

//Declare the public class helicopter, extending air vehicle class
public class helicopter extends airVehicle {

	 	//Variables and their default values
	    private int numberOfMainSystems = 1; //Total number of main rotary systems
	    private int numberOfRearSystems = 1; //Total number of rear rotary systems
	    private int numberOfRotarySystems = numberOfMainSystems + numberOfRearSystems; //Total number of rotary systems needed to achieve flight
	    private int numberOfBlades = 8; //Total number of blades used by the helicopter
		// MD20231201, adding the f qualifier after the value 7.8, to be explicit we mean a float and not a double
	    private float mainBladeLength = 7.8f; //Length of blades on main rotary system(s)
		// MD20231201, adding the f qualifier after the value 1.2, to be explicit we mean a float and not a double
	    private float rearBladeLength = 1.2f; //Length of blades on rear rotary system(s)
		// MD20231201, adding the f qualifier after the value 5000000.0, to be explicit we mean a float and not a double
	    private float cost = 5000000.0f; //Monetary value of the helicopter

	    //Constructor with all variables from parent class airVehicle
		public helicopter(int engines, int tires, int propellers, int weight, int seats, int fuelTank, int lights, int axels, int NumberOfwings, float initialValue){
			super(engines, tires, propellers, weight, seats, fuelTank, lights, axels, NumberOfwings);
		value = initialValue;
		}

		/**Constructor with all variables from helicopter class
		@param rotary The number of rotary systems in the helicopter
		@param mains The number of main rotary systems in the helicopter
		@param rears The number of rear rotay systems in the helicopter
		@param blades The number of blades in used for the rotary systems
		@param mainLength The length of blades on the main rotary system(s)
		@param rearLength The length of blades on the rear rotary system(s)
		*/
		public helicopter(int rotary, int mains, int rears, int blades, float mainLength, float rearLength) {
			     numberOfRotarySystems = rotary;
			     numberOfMainSystems = mains;
			     numberOfRearSystems = rears;
			     numberOfBlades = blades;
			     mainBladeLength = mainLength;
			     rearBladeLength = rearLength;
		}

		//Constructor with all variables from helicopter class & parent class airVehicle
		public helicopter(int engines, int tires, int propellers, int weight, int seats, int fuelTank, int lights, int axels, int NumberOfwings, int rotary, int mains, int rears, int blades, float mainLength, float rearLength){
			// Switching order of this() and super() I am not sure if we can call both within a constructor

			super(engines, tires, propellers, weight, seats, fuelTank, lights, axels, NumberOfwings);
			// MD20231116 1513 it looks like we cannot use both super() and this() in the same constructor
			// so I am removing the call to this() and copying the code from the appropriate constructor above
			// this(rotary, mains, rears, blades, mainLength, rearLength);
			numberOfRotarySystems = rotary;
			numberOfMainSystems = mains;
			numberOfRearSystems = rears;
			numberOfBlades = blades;
			mainBladeLength = mainLength;
			rearBladeLength = rearLength;
		}

		//Default Constructor
		public helicopter() {
		}



	}
