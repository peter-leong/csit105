package csit105labch09sum25;

/**
 * CargoShip class for Lab Ch 09.
 *
 * @author Peter Leong
 */
public class CargoShip extends Ship {

    private int cargoCapacity;

    public CargoShip(String initialShipName, String initialYearBuilt, String initialShipRegistry, int initialCargoCapacity) {
        super(initialShipName, initialYearBuilt, initialShipRegistry);
        cargoCapacity = initialCargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int newCargoCapacity) {
        cargoCapacity = newCargoCapacity;
    }

    @Override
    public String toString() {
        return "CargoShip: shipName: " + getShipName() + " yearBuilt: " + getYearBuilt() + " shipRegistry: " + getShipRegistry() + " cargoCapacity: " + cargoCapacity;
    }

}

/*

Note:

In CargoShip you will have 1 private field: cargoCapacity  which is an int

The Constructor will receive: initialShipName, initialYearBuilt and initialShipRegistry all as Strings
                                and initialCargoCapacity   as int

You will implement the methods:
getCargoCapacity()
setCargoCapacity()  receives newCargoCapacity  an int
toString()

 */
