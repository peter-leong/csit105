package csit105labch09sum25;

/**
 * Lab for Ch 9 - tester for Ship
 *
 * @author Stephen T. Brower
 */
public class BatchTesterShipV5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // values for instantiation of object
        String shipName1 = "Nautilus King of the Sea";
        String yearBuilt1 = "1492";
        String shipRegistry1 = "Location1";

        // values for changing object
        String shipName2 = "Nau Sea";
        String yearBuilt2 = "2017";
        String shipRegistry2 = "Over There";

        // object to create
        Ship myShip;

        // for testing
        int returnValue = 0;

        // display tester header
        System.out.println("\nShip Class Tester version 5\n");

        // announce creation of Ship object
        System.out.println("Creating ship using values: " + shipName1 + " " + yearBuilt1 + " " + shipRegistry1);

        // create Ship object
        myShip = new Ship(shipName1, yearBuilt1, shipRegistry1);

        // display ship name
        System.out.printf("ship getShipName() : %25s", myShip.getShipName());

        // test ship name
        if (myShip.getShipName() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myShip.getShipName().equals(shipName1)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // display year built
        System.out.printf("ship getYearBuilt(): %25s", myShip.getYearBuilt());

        // test year built
        if (myShip.getYearBuilt() == yearBuilt1) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // dislay ship registry (home port locatuon)
        System.out.printf("ship getShipRegistry(): %25s", myShip.getShipRegistry());

        // test ship regitry
        if (myShip.getShipRegistry() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myShip.getShipRegistry().equals(shipRegistry1)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // announce we are changing Ship
        System.out.println("\nchanging ship via setters\nnew values: " + shipName2 + " " + yearBuilt2 + " " + shipRegistry2
                + "\n");

        // change the Ship object
        myShip.setShipName(shipName2);
        myShip.setYearBuilt(yearBuilt2);
        myShip.setShipRegistry(shipRegistry2);

        // display ship name
        System.out.printf("ship getShipName() : %25s", myShip.getShipName());

        // test ship name
        if (myShip.getShipName() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myShip.getShipName().equals(shipName2)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // display year built
        System.out.printf("ship getYearBuilt(): %25s", myShip.getYearBuilt());

        // test year built
        if (myShip.getYearBuilt() == yearBuilt2) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // dislay ship registry (home port locatuon)
        System.out.printf("ship getShipRegistry(): %25s", myShip.getShipRegistry());

        // test ship regitry
        if (myShip.getShipRegistry() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myShip.getShipRegistry().equals(shipRegistry2)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // were there any error detected?
        if (returnValue == 0) {
            // functionally looks good
            System.out.print("\n\nAll functional tests of Ship Good\t\t");
        } else {
            // something went wrong
            System.out.println("\n\n\t\t\t*** issues -- Ship Happened - see issues above -- ***\treturn value: " + returnValue + "\n");
        }

        // display ship using toString() method
        System.out.printf("ship toString(): %s\t\t%s\n\n", myShip, "<-- toString() requires visual inspection");

        //if returnValue is not 0, this throws a fit
        System.exit(returnValue);
    }

}
