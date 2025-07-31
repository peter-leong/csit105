package csit105labch09sum25;

/**
 * Ship class for Lab Ch 09
 *
 * @author Peter Leong
 */
public class Ship {

    private String shipName;
    private String yearBuilt;
    private String shipRegistry;

    public Ship(String initialShipName, String initialYearBuilt, String initialShipRegistry) {
        shipName = initialShipName;
        yearBuilt = initialYearBuilt;
        shipRegistry = initialShipRegistry;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String newShipName) {
        shipName = newShipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String newYearBuilt) {
        yearBuilt = newYearBuilt;
    }

    public String getShipRegistry() {
        return shipRegistry;
    }

    public void setShipRegistry(String newShipRegistry) {
        shipRegistry = newShipRegistry;
    }

    @Override
    public String toString() {
        return "Ship: shipName: " + shipName + " yearBuilt: " + yearBuilt + " shipRegistry: " + shipRegistry;
    }

}

/*
Note: 

In Ship you will have 3 private fields: shipName, yearBuilt and shipRegistry all as Strings

The Constructor will receive: initialShipName, initialYearBuilt and initialShipRegistry all as Strings

You will implement the methods:
getShipName()
getYearBuilt()
getShipRegistry()
setShipName()   receives newShipName a String
setYearBuilt()  receives newYearBuilt a String
setShipRegistry() receives newShipRegistry a String
toString()

Note: 
yearBuilt is a String so that it could handle the ship: Argo from 1300 BC
https://en.wikipedia.org/wiki/Argo

 */
