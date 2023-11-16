/** Eoin Finnerty <br>
Wednesday 20231115 1025 <br>
This is to create class helicopter which extends class airVehicle
*/

//Declare the public class helicopter, extending air vehicle class
public class helicopter extends airVehicle {

	 	//Variables
	    private int numberOfRotarySystems; //Total number of rotary systems needed to achieve flight
	    private int numberOfMainSystems; //Total number of main rotary systems
	    private int numberOfRearSystems; //Total number of rear rotary systems
	    private int numberOfBlades; //Total number of blades used by the helicopter
	    private float mainBladeLength; //Length of blades on main rotary system(s)
	    private float rearBladeLength; //Length of blades on rear rotary system(s)

		//Constructor with only variables from helicopter class
		public helicopter(int rotary, int mains, int rears, int blades, float mainLength, float rearLength) {
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