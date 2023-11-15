/** Eoin Finnerty <br>
Wednesday 20231115 1034 <br>
This is to create class hotAirBallon which extends class airVehicle
*/

//Declare the public class hotAirBallon, extending air vehicle class
public class hotAirBallon extends airVehicle {

	 	//Private variables
	    private float balloonVolume; //Define the maximum volume of the balloon
	    private float basketWeight; //Define the weight of the basket
	    private float balloonWeight; //Define the weight of the balloon
	    private int totalBalloonColours; //Total number of colours on the balloon

	    //Constructor with some variables
	    public hotAirBalloon(float volume, float basket, float balloon, int colours) {
		        super();
		        balloonVolume = volume;
		        basketWeight = basket;
		        balloonWeight = balloon;
		        totalBalloonColours = colours;
		}

		//Default Constructor
		public hotAirBalloon() {
			super();
		}


}