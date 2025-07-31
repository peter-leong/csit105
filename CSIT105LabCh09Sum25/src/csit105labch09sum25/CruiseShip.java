package csit105labch09sum25;

/**
 * CruiseShip class for Lab Ch 09
 *
 * @author Peter Leong
 */
public class CruiseShip extends Ship {

    private int numPassengers;

    public CruiseShip(String initialShipName, String initialYearBuilt, String initialShipRegistry, int initialNumPassengers) {
        super(initialShipName, initialYearBuilt, initialShipRegistry);
        numPassengers = initialNumPassengers;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int newNumPassengers) {
        numPassengers = newNumPassengers;
    }

    @Override
    public String toString() {
        return "CruiseShip: shipName: " + getShipName() + " yearBuilt: " + getYearBuilt() + " shipRegistry: " + getShipRegistry() + " numPassengers: " + numPassengers;
    }

}

/*

Note:

In CruiseShip you will have 1 private field: numPassengers which is an int

The Constructor will receive: initialShipName, initialYearBuilt and initialShipRegistry all as Strings
                                and initialNumPassengers  as int

You will implement the methods:
getNumPassengers()
setNumPassengers()  receives newNumPassengers an int
toString()

 */
