/** Eoin Finnerty <br>
Wednesday 20231115 1034 <br>
This is to create class hotAirBalloon which extends class airVehicle
*/

//Declare the public class hotAirBalloon, extending air vehicle class
public class hotAirBalloon extends airVehicle {

	 	//Private variables
	    private float balloonVolume; //Define the maximum volume of the balloon
	    private float basketWeight; //Define the weight of the basket
	    private float balloonWeight; //Define the weight of the balloon
	    private int totalBalloonColours; //Total number of colours on the balloon

		//Constructor with all variables from parent class airVehicle
		public hotAirBalloon(int engines, int tires, int propellers, int weight, int seats, int fuelTank, int lights, int axels, int NumberOfwings){
			super(engines, tires, propellers, weight, seats, fuelTank, lights, axels, NumberOfwings);
		}

	    //Constructor with all variables from hotAirBalloon class
	    public hotAirBalloon(float volume, float basket, float balloon, int colours) {
		        balloonVolume = volume;
		        basketWeight = basket;
		        balloonWeight = balloon;
		        totalBalloonColours = colours;
		}

		//Constructor with all variables from hotAirBalloon class & parent class airVehicle
		public hotAirBalloon(int engines, int tires, int propellers, int weight, int seats, int fuelTank, int lights, int axels, int NumberOfwings, float volume, float basket, float balloon, int colours){
			super(engines, tires, propellers, weight, seats, fuelTank, lights, axels, NumberOfwings);
			this(volume, basket, balloon, colours);
		}

		//Default Constructor
		public hotAirBalloon() {
		}


}