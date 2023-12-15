/**
 * Author: B00147516@mytudublin.ie, Shane Dixon, TU Dublin Blanchardstown
 * Last Updated: 23/11/2023, 12:12, Vehicle Project
 * @see Object
 */
public class Vehicle implements asset {

    private int Standsformachinecapableoftransportingpeople;
    private int Passengerspacevariesdependingonvehicle;
    protected float value;

    @Override
    public void setValue(float assetValue) {
        this.value = assetValue;
    }

    @Override
    public float getValue() {
        return value;
    }

    // Implement methods from the Asset interface here
    @Override
    public void someMethod() {
        // Implementation for the interface method
    }

    public static void main(String[] args) {
        // Your main method code here
    }
}
