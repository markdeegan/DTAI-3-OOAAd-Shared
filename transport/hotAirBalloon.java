/** Eoin Finnerty <br>
Wednesday 20231115 1034 <br>
This is to create class hotAirBalloon which extends class airVehicle
*/

//Declare the public class hotAirBalloon, extending air vehicle class
public class hotAirBalloon extends airVehicle {

	 	//Private variables
	    private float balloonVolume = 2500; //Define the maximum volume of the balloon
	    private float basketWeight = 64; //Define the weight of the basket
	    private float balloonWeight = 110; //Define the weight of the balloon
	    private int totalBalloonColours = 2; //Total number of colours on the balloon
	    private String balloonColours = ""; //List colour(s) of the balloon

		//Constructor with all variables from parent class airVehicle
		public hotAirBalloon(int engines, int tires, int propellers, int weight, int seats, int fuelTank, int lights, int axels, int NumberOfwings){
			super(engines, tires, propellers, weight, seats, fuelTank, lights, axels, NumberOfwings);
		}

	    //Constructor with all variables from hotAirBalloon class
	    public hotAirBalloon(float volume, float basket, float balloon, int totalColours, String colours) {
		        balloonVolume = volume;
		        basketWeight = basket;
		        balloonWeight = balloon;
		        totalBalloonColours = totalColours;
		        balloonColours = colours;

		}

		//Constructor with all variables from hotAirBalloon class & parent class airVehicle
		public hotAirBalloon(int engines, int tires, int propellers, int weight, int seats, int fuelTank, int lights, int axels, int NumberOfwings, float volume, float basket, float balloon, int totalColours, String colours){
			super(engines, tires, propellers, weight, seats, fuelTank, lights, axels, NumberOfwings);
			// MD20231116 1513 it looks like we cannot use both super() and this() in the same constructor
			// so I am removing the call to this() and copying the code from the appropriate constructor above
			// this(volume, basket, balloon, colours);
			balloonVolume = volume;
		    basketWeight = basket;
		    balloonWeight = balloon;
		    totalBalloonColours = totalColours;
		    balloonColours = colours;
		}

		//Default Constructor
		public hotAirBalloon() {
		}


}
